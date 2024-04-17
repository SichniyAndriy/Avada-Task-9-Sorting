package count;

import java.util.Arrays;
import main.TaskUtil;

/*
 * Count sort
 * Best-case performance - O(n + k)
 * Worst-case performance - O(n * k)
 * Worst-case space complexity - O(n + k)
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = TaskUtil.initArray();
        System.out.println("Count sorting");
        System.out.println("Unsorted array: " + Arrays.toString(arr));
        countingSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    private static void countingSort(int[] arr) {
        int[] indexes = findLenForBuffer(arr);
        int[] buffer = new int[indexes[1] - indexes[0] + 1];

        for (int k : arr) {
            int offset = indexes[0] < 0 ? -indexes[0] : k - indexes[0];
            int tmp = k + offset;
            ++buffer[tmp];
        }

        for (int i = 0, j = 0; i < buffer.length; ++i) {
            while (buffer[i] > 0) {
                arr[j++] = i + indexes[0];
                --buffer[i];
            }
        }
    }

    private static int[] findLenForBuffer(int[] arr) {
        int[] indexes = new int[2];
        Arrays.fill(indexes, arr[0]);
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < indexes[0]) {
                indexes[0] = arr[i];
            }
            if (arr[i] > indexes[1]) {
                indexes[1] = arr[i];
            }
        }
        return indexes;
    }
}
