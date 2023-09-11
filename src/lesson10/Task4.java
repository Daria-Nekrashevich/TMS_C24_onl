package lesson10;
/*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.*/

import java.util.Arrays;

import static lesson10.Task1.generateArray;
import static lesson10.Task1.printArray;

public class Task4 {
    public static void main(String[] args) {
        String[] array = generateArray();
        printArray(array);
        String word = new String();
        for (int i = 0; i < array.length; i++) {
            char[] arr = array[i].toCharArray();
            word += array[i].charAt(0);
            for (int j = 1; j < arr.length; j++) {
                int index = word.indexOf(arr[j]);
                if (index == -1) {
                    word += arr[j];
                } else {
                    word = " ";
                    break;
                }
            }
            if (word != " ") {
                System.out.println("Слово, состоящее только из различных символов: " + word);
                break;
            }
        }

    }
}