package lesson4;

//Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести сообщение, что их нет.
import java.util.Arrays;

import static lesson4.Task1.generateArray;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("В массиве нет нулевых элементов");
        } else {
            System.out.println("В массиве " + count + " нулевых элементов");
        }
    }
}
