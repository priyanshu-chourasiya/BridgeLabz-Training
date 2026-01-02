package LinkedList.DoubleLL;

class MovieNode {
    String title;
    String director;
    int year;
    double rating;
    MovieNode next;
    MovieNode prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
        this.next = null;
        this.prev = null;
    }
}

class MovieDoublyLinkedList {
    MovieNode head;
    MovieNode tail;

    // Add at beginning
    void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Add at position (1 = beginning)
    void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1 || head == null) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        MovieNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        if (temp.next != null) temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;

        if (newNode.next == null) tail = newNode;
    }

    // Remove by title
    void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp.prev != null) temp.prev.next = temp.next;
                else head = temp.next;

                if (temp.next != null) temp.next.prev = temp.prev;
                else tail = temp.prev;

                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Search by director
    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies by this director");
    }

    // Search by rating
    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies with this rating");
    }

    // Update rating by title
    void updateRating(String title, double newRating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // Display forward
    void displayForward() {
        MovieNode temp = head;
        System.out.println("Movies (Forward):");
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    // Display backward
    void displayBackward() {
        MovieNode temp = tail;
        System.out.println("Movies (Backward):");
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    // Print a single movie
    void printMovie(MovieNode m) {
        System.out.println("Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
    }
}

public class MovieManagement {
    public static void main(String[] args) {
        MovieDoublyLinkedList movies = new MovieDoublyLinkedList();

        // Add movies
        movies.addAtEnd("Inception", "Nolan", 2010, 9.0);
        movies.addAtBeginning("Interstellar", "Nolan", 2014, 8.6);
        movies.addAtEnd("Avengers", "Russo", 2018, 8.4);
        movies.addAtPosition(2, "Titanic", "Cameron", 1997, 7.8);

        // Display
        movies.displayForward();
        movies.displayBackward();

        // Search
        System.out.println("\nMovies by Nolan:");
        movies.searchByDirector("Nolan");

        System.out.println("\nMovies with rating 8.4:");
        movies.searchByRating(8.4);

        // Update rating
        System.out.println("\nUpdate rating of Titanic to 8.0");
        movies.updateRating("Titanic", 8.0);
        movies.displayForward();

        // Remove movie
        System.out.println("\nRemove Avengers");
        movies.removeByTitle("Avengers");
        movies.displayForward();
    }
}
