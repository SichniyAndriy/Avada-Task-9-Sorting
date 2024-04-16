package gnome;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Gnome sort
 * Best-case performance - O(n)
 * Worst-case performance - O(n^3)
 * Worst-case space complexity - O(1)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Gnome sorting");
        int[] arr = TaskUtil.initArray();
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        gnomeSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void gnomeSort(int[] arr) {
        for (int i = 0; i < arr.length - 1;) {
            if (arr[i] > arr[i + 1]) {
                TaskUtil.swap(arr, i, i + 1);
                if (--i == -1) {
                    i = 0;
                }
            } else {
                ++i;
            }
        }
    }
}
