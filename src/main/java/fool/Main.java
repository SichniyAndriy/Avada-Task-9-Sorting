package fool;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Comb sort based on shuffle and check way
 * Best-case performance - O(n)
 * Worst-case performance - O(n^3)
 * Worst-case space complexity - O(1)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("fool sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        foolSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void foolSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                TaskUtil.swap(arr, i,i + 1);
                i = -1;
            }
        }
    }
}
