package main;

import net.datafaker.Faker;

public class TaskUtil {
    public final static Faker faker = new Faker();
    public final static int SIZE = 10;

    public static int[] initArray() {
        int[] arr = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            arr[i] = faker.random().nextInt(-99, 99);
        }
        return arr;
    }

    public static void swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;
    }
}
