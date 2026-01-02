package LinkedList.CircularLL;

class TaskNode {
    int taskID;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskID, String taskName, int priority, String dueDate) {
        this.taskID = taskID;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    TaskNode head;
    TaskNode tail;
    TaskNode current; // For viewing current task

    // Add at beginning
    void addAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = tail = current = newTask;
            newTask.next = newTask; // Circular
        } else {
            newTask.next = head;
            head = newTask;
            tail.next = head; // Maintain circular
        }
    }

    // Add at end
    void addAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = tail = current = newTask;
            newTask.next = newTask;
        } else {
            tail.next = newTask;
            newTask.next = head;
            tail = newTask;
        }
    }

    // Add at position (1 = beginning)
    void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newTask = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        int count = 1;
        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        newTask.next = temp.next;
        temp.next = newTask;

        if (temp == tail) tail = newTask; // Update tail if added at end
    }

    // Remove by Task ID
    void removeByID(int id) {
        if (head == null) return;

        // Special case: head to remove
        if (head.taskID == id) {
            if (head == tail) { // Only one node
                head = tail = current = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            if (temp.next.taskID == id) {
                if (temp.next == tail) tail = temp;
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Task not found");
    }

    // Display all tasks
    void displayAll() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        System.out.println("All tasks:");
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // View current task and move to next
    void viewCurrentTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }
        printTask(current);
        current = current.next; // Move to next task
    }

    // Search by priority
    void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }
        TaskNode temp = head;
        boolean found = false;
        do {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No tasks with this priority");
    }

    void printTask(TaskNode t) {
        System.out.println("ID: " + t.taskID + ", Name: " + t.taskName +
                ", Priority: " + t.priority + ", Due Date: " + t.dueDate);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addAtEnd(1, "Write Report", 2, "2026-01-05");
        scheduler.addAtBeginning(2, "Email Client", 1, "2026-01-03");
        scheduler.addAtEnd(3, "Team Meeting", 3, "2026-01-04");
        scheduler.addAtPosition(2, 4, "Code Review", 2, "2026-01-06");

        // Display all tasks
        scheduler.displayAll();

        // View current task in circular manner
        System.out.println("\nView tasks circularly:");
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask();
        scheduler.viewCurrentTask(); // Loops back to first

        // Search by priority
        System.out.println("\nSearch tasks with priority 2:");
        scheduler.searchByPriority(2);

        // Remove a task
        System.out.println("\nRemove task ID 3:");
        scheduler.removeByID(3);
        scheduler.displayAll();
    }
}
