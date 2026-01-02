package LinkedList.DoubleLL;

class BookNode {
    String title;
    String author;
    String genre;
    int bookID;
    boolean available;
    BookNode next;
    BookNode prev;

    BookNode(String title, String author, String genre, int bookID, boolean available) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class LibraryDoublyLinkedList {
    BookNode head;
    BookNode tail;

    // Add at beginning
    void addAtBeginning(String title, String author, String genre, int bookID, boolean available) {
        BookNode newBook = new BookNode(title, author, genre, bookID, available);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
    }

    // Add at end
    void addAtEnd(String title, String author, String genre, int bookID, boolean available) {
        BookNode newBook = new BookNode(title, author, genre, bookID, available);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
    }

    // Add at position (1 = beginning)
    void addAtPosition(int pos, String title, String author, String genre, int bookID, boolean available) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, author, genre, bookID, available);
            return;
        }

        BookNode newBook = new BookNode(title, author, genre, bookID, available);
        BookNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) temp = temp.next;

        newBook.next = temp.next;
        if (temp.next != null) temp.next.prev = newBook;
        newBook.prev = temp;
        temp.next = newBook;

        if (newBook.next == null) tail = newBook;
    }

    // Remove by Book ID
    void removeByID(int bookID) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Search by Title
    void searchByTitle(String title) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("Book not found");
    }

    // Search by Author
    void searchByAuthor(String author) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No books by this author");
    }

    // Update availability by Book ID
    void updateAvailability(int bookID, boolean available) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.available = available;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        System.out.println("Library Books (Forward):");
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }

    // Display backward
    void displayBackward() {
        BookNode temp = tail;
        System.out.println("Library Books (Backward):");
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    // Count total books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }

    // Print one book
    void printBook(BookNode b) {
        System.out.println("ID: " + b.bookID + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre + ", Available: " + b.available);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        // Add books
        library.addAtEnd("Harry Potter", "J.K. Rowling", "Fantasy", 101, true);
        library.addAtBeginning("The Hobbit", "Tolkien", "Fantasy", 100, true);
        library.addAtPosition(2, "1984", "George Orwell", "Dystopia", 102, true);
        library.addAtEnd("To Kill a Mockingbird", "Harper Lee", "Fiction", 103, false);

        // Display
        library.displayForward();
        library.displayBackward();

        // Search
        System.out.println("\nSearch by title '1984':");
        library.searchByTitle("1984");

        System.out.println("\nSearch by author 'Tolkien':");
        library.searchByAuthor("Tolkien");

        // Update availability
        System.out.println("\nUpdate availability of book 103 to true");
        library.updateAvailability(103, true);
        library.displayForward();

        // Remove a book
        System.out.println("\nRemove book ID 101");
        library.removeByID(101);
        library.displayForward();

        // Count total books
        library.countBooks();
    }
}
