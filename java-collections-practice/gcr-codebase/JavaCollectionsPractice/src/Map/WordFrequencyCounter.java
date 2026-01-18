package Map;

import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String text = "Hello world, hello Java!";

    
        text = text.toLowerCase();

        
        text = text.replace(",", "");
        text = text.replace("!", "");

        
        String[] words = text.split(" ");

        
        HashMap<String, Integer> map = new HashMap<>();

        for (String w : words) {
            if (map.containsKey(w)) {
                map.put(w, map.get(w) + 1);
            } 
            else {
                map.put(w, 1);
            }
        }

        System.out.println(map);
    }
}

