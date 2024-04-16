package insertion;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Insertion sort
 * Best-case performance - O(n)
 * Worst-case performance - O(n^2)
 * Worst-case space complexity - O(1)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Choice sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int tmp = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > tmp) {
                arr[j] = arr[j - 1];
                --j;
            }
            arr[j] = tmp;
        }
    }
}
