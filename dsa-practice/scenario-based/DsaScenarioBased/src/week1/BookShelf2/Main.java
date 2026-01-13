/*
 *  BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. A HashMap maps
genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or
returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).
 */

package week1.BookShelf2;

import java.util.*;

public class Main {
    HashMap<String, LinkedList<String>> shelf = new HashMap<>();
    HashSet<String> uniqueBooks = new HashSet<>();

    void addBook(String genre, String book) {
        if (!uniqueBooks.contains(book)) {
            shelf.putIfAbsent(genre, new LinkedList<>());
            shelf.get(genre).add(book);
            uniqueBooks.add(book);
        }
    }

    void removeBook(String genre, String book) {
        if (shelf.containsKey(genre)) {
            shelf.get(genre).remove(book);
            uniqueBooks.remove(book);
        }
    }

    void printGenre(String genre) {
        if (shelf.containsKey(genre)) {
            System.out.println(genre + ": " + shelf.get(genre));
        } else {
            System.out.println("Genre not found");
        }
    }

    void printAll() {
        for (String genre : shelf.keySet()) {
            System.out.println(genre + ": " + shelf.get(genre));
        }
    }

    public static void main(String[] args) {
        Main lib = new Main();

        lib.addBook("Fiction", "Harry Potter");
        lib.addBook("Fiction", "The Hobbit");
        lib.addBook("Science", "Physics Basics");
        lib.addBook("Science", "Biology Guide");
        lib.addBook("Fiction", "Harry Potter");

        lib.printAll();

        lib.removeBook("Fiction", "The Hobbit");
        lib.printGenre("Fiction");
    }
}
