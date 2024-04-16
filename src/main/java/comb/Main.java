package comb;

import java.util.Arrays;
import main.TaskUtil;

/*
* Comb sort
* Best-case performance - O(n log n)
* Worst-case performance - O(n^2)
* Worst-case space complexity -	O(1)
*/
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Comb sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        combSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void combSort(int[] arr) {
        int gap = arr.length;
        boolean sorted = false;

        while (gap > 1 || !sorted) {
            sorted = true;
            double v = gap / 1.3;
            gap = v < 1 ? 1 : (int) v;
            for (int i = 0; i < arr.length - gap; ++i) {
                if (arr[i] > arr[i + gap]) {
                    TaskUtil.swap(arr, i, i + gap);
                    sorted = false;
                }
            }
        }
    }
}
