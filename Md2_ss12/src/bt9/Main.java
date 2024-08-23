package bt9;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int decimalNumber = 111;
        Stack<Integer> stack = new Stack<>();

        while (decimalNumber != 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }

        StringBuilder binaryNumber = new StringBuilder();
        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        System.out.println("Số nhị phân: " + binaryNumber.toString());
    }
}

