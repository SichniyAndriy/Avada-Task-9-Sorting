package choice;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Choice sort
 * Best-case performance - O(n)
 * Worst-case performance - O(n^2)
 * Worst-case space complexity - O(1)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Choice sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        choiceSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void choiceSort(int[] arr) {
        int index;
        for (int i = 0; i < arr.length; ++i) {
            index = 0;
            for (int j = 1; j < arr.length - i; ++j) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            TaskUtil.swap(arr, arr.length - i - 1, index);
        }
    }
}
