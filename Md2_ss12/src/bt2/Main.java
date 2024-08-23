package bt2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {

                if (stack.isEmpty()) {
                    System.out.println("Chuỗi không hợp lệ: dấu ngoặc đóng không có cặp.");
                    return;
                }

                char topChar = stack.pop();
                if (!isMatchingPair(topChar, currentChar)) {
                    System.out.println("Chuỗi không hợp lệ: dấu ngoặc mở và đóng không khớp.");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Chuỗi hợp lệ.");
        } else {
            System.out.println("Chuỗi không hợp lệ: dấu ngoặc mở không có cặp.");
        }

        scanner.close();
    }

    public static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
