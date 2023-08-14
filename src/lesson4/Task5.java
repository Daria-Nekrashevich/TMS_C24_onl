package lesson4;
//Пройти по массиву и поменять местами элементы первый и последний, второй и
//предпоследний и т.д.
import java.util.Arrays;

import static lesson4.Task1.generateArray;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        int per = arr.length - 1;
        int k;
        for (int i = 0; i < arr.length / 2; i++) {
            k = arr[i];
            arr[i] = arr[per];
            arr[per] = k;
            per--;
        }
        System.out.println("Ваш измененный массив: ");
        System.out.println(Arrays.toString(arr));
    }
}
