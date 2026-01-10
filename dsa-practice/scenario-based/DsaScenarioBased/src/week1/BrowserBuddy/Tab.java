package week1.BrowserBuddy;

import java.util.LinkedList;
import java.util.ListIterator;

public class Tab {
    LinkedList<String> history = new LinkedList<>();
    ListIterator<String> current;

    public Tab() {
        current = history.listIterator();
    }

    
    public void visit(String url) {
        
        while(current.hasNext()) {
            current.next();
            current.remove();
        }
        
        current.add(url);
    }

    
    public void back() {
        if(current.hasPrevious()) {
            String prevPage = current.previous();
            System.out.println("Back to: " + prevPage);
        } 
        else {
            System.out.println("No previous page");
        }
    }

    
    public void forward() {
        if(current.hasNext()) {
            String nextPage = current.next();
            System.out.println("Forward to: " + nextPage);
        }
        else {
            System.out.println("No next page");
        }
    }
}

