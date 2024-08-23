package bt7;

import java.util.Stack;

public class Main {
    public static boolean isDescending(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        boolean flag = true;

        char prevChar = stack.pop();
        while (!stack.isEmpty()) {
            char currentChar = stack.pop();

            if (currentChar > prevChar) {
                flag = false;
                break;
            }
            prevChar = currentChar;
        }

        return flag;
    }

    public static void main(String[] args) {
        String input = "54321";
        if (isDescending(input)) {
            System.out.println("Chuỗi đầu vào là dãy giảm dần.");
        } else {
            System.out.println("Chuỗi đầu vào không phải là dãy giảm dần.");
        }
    }
}
