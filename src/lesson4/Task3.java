package lesson4;

import java.util.Arrays;

import static lesson4.Task1.generateArray;
import static lesson4.Task2.maxEl;
import static lesson4.Task2.minEl;

//Найти индексы минимального и максимального элементов и вывести в консоль.
public class Task3 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        int min = minEl(arr);
        int max = maxEl(arr);
        int min_index = 0, max_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                min_index = i;
            }
            if (arr[i] == max) {
                max_index = i;
            }
        }
        System.out.println("Индексы минимального элемента в массиве = " + min_index + " и максимального = " + max_index);
    }

}
