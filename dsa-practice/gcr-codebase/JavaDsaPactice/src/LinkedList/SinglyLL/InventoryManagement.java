package LinkedList.SinglyLL;

class ItemNode {
    int itemID;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    ItemNode(int itemID, String itemName, int quantity, double price) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class InventoryLinkedList {
    ItemNode head;

    // Add at beginning
    void addAtBeginning(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    void addAtEnd(int id, String name, int qty, double price) {
        ItemNode newNode = new ItemNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    // Add at specific position (1 = beginning)
    void addAtPosition(int pos, int id, String name, int qty, double price) {
        if (pos <= 1 || head == null) {
            addAtBeginning(id, name, qty, price);
            return;
        }
        ItemNode newNode = new ItemNode(id, name, qty, price);
        ItemNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by Item ID
    void deleteByID(int id) {
        if (head == null) return;
        if (head.itemID == id) {
            head = head.next;
            return;
        }
        ItemNode temp = head;
        while (temp.next != null) {
            if (temp.next.itemID == id) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    // Update quantity by Item ID
    void updateQuantity(int id, int newQty) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == id) {
                temp.quantity = newQty;
                return;
            }
            temp = temp.next;
        }
    }

    // Search by Item ID
    void searchByID(int id) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemID == id) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Search by Item Name
    void searchByName(String name) {
        ItemNode temp = head;
        while (temp != null) {
            if (temp.itemName.equalsIgnoreCase(name)) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found");
    }

    // Display all items
    void display() {
        ItemNode temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }

    // Print single item
    void printItem(ItemNode item) {
        System.out.println("ID: " + item.itemID + ", Name: " + item.itemName +
                ", Qty: " + item.quantity + ", Price: " + item.price);
    }

    // Calculate total value
    void totalValue() {
        double total = 0;
        ItemNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    // Simple bubble sort by price ascending
    void sortByPrice(boolean ascending) {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            ItemNode temp = head;
            while (temp.next != null) {
                if ((ascending && temp.price > temp.next.price) ||
                    (!ascending && temp.price < temp.next.price)) {
                    // Swap data
                    int id = temp.itemID;
                    String name = temp.itemName;
                    int qty = temp.quantity;
                    double price = temp.price;

                    temp.itemID = temp.next.itemID;
                    temp.itemName = temp.next.itemName;
                    temp.quantity = temp.next.quantity;
                    temp.price = temp.next.price;

                    temp.next.itemID = id;
                    temp.next.itemName = name;
                    temp.next.quantity = qty;
                    temp.next.price = price;

                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    // Simple bubble sort by name ascending
    void sortByName(boolean ascending) {
        if (head == null) return;
        boolean swapped;
        do {
            swapped = false;
            ItemNode temp = head;
            while (temp.next != null) {
                if ((ascending && temp.itemName.compareToIgnoreCase(temp.next.itemName) > 0) ||
                    (!ascending && temp.itemName.compareToIgnoreCase(temp.next.itemName) < 0)) {
                    // Swap data
                    int id = temp.itemID;
                    String name = temp.itemName;
                    int qty = temp.quantity;
                    double price = temp.price;

                    temp.itemID = temp.next.itemID;
                    temp.itemName = temp.next.itemName;
                    temp.quantity = temp.next.quantity;
                    temp.price = temp.next.price;

                    temp.next.itemID = id;
                    temp.next.itemName = name;
                    temp.next.quantity = qty;
                    temp.next.price = price;

                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        InventoryLinkedList inv = new InventoryLinkedList();

        inv.addAtEnd(101, "Pen", 50, 5.0);
        inv.addAtEnd(102, "Notebook", 30, 20.0);
        inv.addAtBeginning(100, "Eraser", 100, 2.0);

        System.out.println("All items:");
        inv.display();

        System.out.println("\nSearch ID 102:");
        inv.searchByID(102);

        System.out.println("\nUpdate quantity of ID 100 to 120");
        inv.updateQuantity(100, 120);
        inv.display();

        System.out.println("\nDelete item ID 101");
        inv.deleteByID(101);
        inv.display();

        System.out.println("\nTotal inventory value:");
        inv.totalValue();

        System.out.println("\nSort by Price Ascending:");
        inv.sortByPrice(true);
        inv.display();

        System.out.println("\nSort by Name Descending:");
        inv.sortByName(false);
        inv.display();
    }
}
