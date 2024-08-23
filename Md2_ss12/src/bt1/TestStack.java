package bt1;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Stack<String> wordStack = new Stack<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng từ: ");
        int wordCount = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số nguyên

        for (int i = 0; i < wordCount; i++) {
            System.out.print("Nhập từ thứ " + (i + 1) + ": ");
            String word = scanner.nextLine();
            wordStack.push(word);
        }

        System.out.println("Các từ theo thứ tự đảo ngược:");
        while (!wordStack.isEmpty()) {
            System.out.println(wordStack.pop());
        }

        scanner.close();
    }
}
