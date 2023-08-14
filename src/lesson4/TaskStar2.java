package lesson4;

import java.util.Arrays;
import java.util.Collections;

import static lesson4.Task1.generateArray;

//отсортировать массив случайных чисел методом сортировки вставками
public class TaskStar2 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        int j;
        for (int i = 1; i < arr.length; i++) {
            int buff = arr[i];
            for (j = i; j > 0 && arr[j - 1] > buff; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = buff;
        }
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
