package lesson4;
//Найти минимальный-максимальный элементы и вывести в консоль.

import java.util.Arrays;
import static lesson4.Task1.generateArray;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        int min = minEl(arr), max = maxEl(arr);
        System.out.println("Минимальный элемент массива = " + min + " и максимальный элемент массива = " + max);
    }

    public static int minEl(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxEl(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
