package LinkedList.DoubleLL;

class TextStateNode {
    String text;
    TextStateNode next;
    TextStateNode prev;

    TextStateNode(String text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

class TextEditorHistory {
    TextStateNode head;
    TextStateNode tail;
    TextStateNode current;
    int size = 0;
    final int MAX_HISTORY = 10;

    // Add a new state
    void addState(String text) {
        TextStateNode newState = new TextStateNode(text);

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        // Remove redo history if we are not at tail
        if (current.next != null) {
            current.next.prev = null;
            current.next = null;
            tail = current;
        }

        // Append new state
        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Limit history to MAX_HISTORY
        while (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo: go to previous state
    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("No more undo available");
        }
    }

    // Redo: go to next state
    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("No more redo available");
        }
    }

    // Display current text
    void displayCurrent() {
        if (current != null) {
            System.out.println("Current Text: " + current.text);
        } else {
            System.out.println("No text available");
        }
    }
}

public class TextEditor {
    public static void main(String[] args) {
        TextEditorHistory editor = new TextEditorHistory();

        // Add text states
        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.displayCurrent();

        // Undo
        System.out.println("\nUndo:");
        editor.undo();
        editor.displayCurrent();

        System.out.println("\nUndo:");
        editor.undo();
        editor.displayCurrent();

        // Redo
        System.out.println("\nRedo:");
        editor.redo();
        editor.displayCurrent();

        System.out.println("\nAdd new state after undo (clears redo history):");
        editor.addState("Hello Everyone!");
        editor.displayCurrent();

        System.out.println("\nTry Redo (should fail):");
        editor.redo();
    }
}

