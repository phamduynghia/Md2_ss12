package bt8;

import java.util.Stack;

public class Main {

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeSequence(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            int number = Character.getNumericValue(stack.pop());
            if (!isPrime(number)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "2357";
        if (isPrimeSequence(input)) {
            System.out.println("Chuỗi đầu vào là dãy số nguyên tố.");
        } else {
            System.out.println("Chuỗi đầu vào không phải là dãy số nguyên tố.");
        }
    }
}

