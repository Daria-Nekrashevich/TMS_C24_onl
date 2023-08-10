package lesson4;
//Проверить, является ли массив возрастающей последовательностью (каждое следующее
//число больше предыдущего).
import java.util.Arrays;

import static lesson4.Task1.generateArray;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                k++;
            }
        }
        if (k == arr.length - 1) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив не является возрастающей последовательностью");
        }
    }
}
