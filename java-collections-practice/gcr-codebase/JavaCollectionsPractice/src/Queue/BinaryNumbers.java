package Queue;

import java.util.*;

public class BinaryNumbers {

    public static void main(String[] args) {

        int N = 5;

        List<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < N; i++) {

            String current = queue.remove();
            result.add(current);

            queue.add(current + "0");
            queue.add(current + "1");
        }

        System.out.println(result);
    }
}
