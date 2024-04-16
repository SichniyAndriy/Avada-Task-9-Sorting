package stooge;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Stooge sort
 * Worst-case performance - O(n ^ (log3 / log1.5))
 * Worst-case space complexity - O(n)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Odd-even sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        stoogeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void stoogeSort(int[] arr) {
        stoogeSort(arr, 0, arr.length - 1);
    }

    private static void stoogeSort(int[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            TaskUtil.swap(arr, i, j);
        }
        int border = j - i + 1;
        if (border > 2) {
            int pivot = border / 3;
            stoogeSort(arr, i, j - pivot);
            stoogeSort(arr, i + pivot, j);
            stoogeSort(arr, i, j - pivot);
        }
    }
}
