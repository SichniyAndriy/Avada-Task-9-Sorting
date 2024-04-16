package oddeven;

import java.util.Arrays;
import main.TaskUtil;

/*
* Odd-even sort based on bubble sort
* Best-case performance - O(n)
* Worst-case performance - O(n ^ 2)
* Worst-case space complexity -	O(1)
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Odd-even sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        oddevenSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void oddevenSort(int[] arr) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    TaskUtil.swap(arr, i,i + 1);
                    sorted = false;
                }
            }
            for (int i = 1; i < arr.length - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    TaskUtil.swap(arr, i,i + 1);
                    sorted = false;
                }
            }
        }
    }
}
