package bt6;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static int findMinElement(int[] arr) {

        Queue<Integer> queue = new LinkedList<>();

        for (int element : arr) {
            queue.add(element);
        }

        int minElement = queue.poll();

        while (!queue.isEmpty()) {
            int currentElement = queue.poll();
            if (currentElement < minElement) {
                minElement = currentElement;
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2, 7};
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + findMinElement(arr));
    }
}
