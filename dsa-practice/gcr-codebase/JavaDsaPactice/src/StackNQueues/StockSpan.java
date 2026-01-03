package StackNQueues;

import java.util.Stack;

class StockSpan {

    static int[] calculateSpan(int[] price) {
        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++) {

            // Pop indices with smaller or equal price
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(price);

        System.out.println("Stock Spans:");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}

