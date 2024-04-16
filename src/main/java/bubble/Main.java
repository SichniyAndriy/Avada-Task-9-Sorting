package bubble;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Bubble sort
 * Best-case performance - O(n)
 * Worst-case performance - O(n^2)
 * Worst-case space complexity - O(1)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Bubble sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i - 1] > arr[i]) {
                    TaskUtil.swap(arr, i - 1, i);
                    sorted = false;
                }
            }
        }
    }
}
