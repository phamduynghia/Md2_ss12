package bt3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        String input = "Able was I ere I saw Elba";

        if (isPalindrome(input)) {
            System.out.println("Chuỗi là Palindrome.");
        } else {
            System.out.println("Chuỗi không phải là Palindrome.");
        }
    }

    public static boolean isPalindrome(String input) {

        String sanitizedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < sanitizedInput.length(); i++) {
            char currentChar = sanitizedInput.charAt(i);
            stack.push(currentChar);
            queue.add(currentChar);
        }

        while (!stack.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.poll();

            if (stackChar != queueChar) {
                return false;
            }
        }

        return true;
    }
}

