/*
 * TextEditor – Undo/Redo Functionality (Stack)
Story: Shanaya is building a basic text editor app. Every action (insert, delete, format) is
pushed onto a Stack. An Undo action pops from the stack, and Redo uses another stack to
reapply actions.
Requirements:
● Support insert/delete operations.
● Undo using a stack.
● Maintain redo stack separately.

 */
package week1.TextEditor;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	static String text = "";
	static Deque<String> undoq = new ArrayDeque<>();
	static Deque<String> redoq = new ArrayDeque<>();
	
	public static void insert(String newText) {
        undoq.push(text);   
        text = text + newText; 
        redoq.clear();      
        System.out.println("Inserted: " + newText);
    }
	
	public static void delete(int n) {
        if (n > text.length()) n = text.length();

        undoq.push(text); 
        text = text.substring(0, text.length() - n);
        redoq.clear();
        System.out.println("Deleted last " + n + " characters");
    }
	
	public static void undo() {
        if (undoq.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        redoq.push(text);     
        text = undoq.pop();   
        System.out.println("Undo performed.");
    }
	
	public static void redo() {
        if (redoq.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        undoq.push(text);    
        text = redoq.pop();   
        System.out.println("Redo performed.");
    }

    public static void showText() {
        System.out.println("Current Text: \"" + text + "\"");
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		insert("Hello");
        insert(" World");
        showText();

        delete(5);
        showText();

        undo();
        showText();

        redo();
        showText();
		
	}

}
