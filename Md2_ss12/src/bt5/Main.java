package bt5;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        int[] arr = {15, 22, 8, 3, 19, 30, 17};

        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {

            if (stack.isEmpty() || num > stack.peek()) {
                stack.push(num);
            }
        }

        System.out.println("Phần tử lớn nhất trong mảng là: " + stack.peek());
    }
}

