package god;

import java.util.Arrays;
import main.TaskUtil;

/*
* God sort
* Best-case performance - O(n * n!)
* Worst-case performance - O(n)
* Worst-case space complexity - O(1)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("God sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        godSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void godSort(int[] arr) {
        while (!isSorted(arr)) {
            for (int i = 0; i < arr.length; ++i) {
                TaskUtil.swap(arr, i, TaskUtil.faker.random().nextInt(arr.length));
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
