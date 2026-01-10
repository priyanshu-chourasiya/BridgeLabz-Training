package week1.BrowserBuddy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Browser {
    List<Tab> openTabs = new ArrayList<>();
    Stack<Tab> closedTabs = new Stack<>();

    
    public void openTab(Tab t) {
        openTabs.add(t);
        System.out.println("Opened a new tab");
    }

    
    public void closeTab(Tab t) {
        if(openTabs.remove(t)) {
            closedTabs.push(t);
            System.out.println("Closed a tab and added to recently closed stack");
        }
    }

    
    public void reopenTab() {
        if(!closedTabs.isEmpty()) {
            Tab t = closedTabs.pop();
            openTabs.add(t);
            System.out.println("Reopened a recently closed tab");
        } 
        
        else {
            System.out.println("No recently closed tabs to reopen");
        }
    }
}
