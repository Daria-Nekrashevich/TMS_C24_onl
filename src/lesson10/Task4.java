package lesson10;
/*Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
Если таких слов несколько, найти первое из них.*/

import java.util.Arrays;

import static lesson10.Task1.generateArray;
import static lesson10.Task1.printArray;

public class Task4 {
    public static void main(String[] args) { //пока с ошибками
        String[] array = generateArray();
        printArray(array);
        String buff = new String();
        String[] words = new String[3];
        for (int k = 0; k < array.length; k++) {
            String[] array2 = array[k].split(" ");
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length() - 1; j++) {
                    if (array2[i].charAt(j) != array2[i].charAt(j + 1)) {
                        buff += array2[i].charAt(j);
                    } else {
                        buff = " ";
                    }
                    words[k] = buff;
                    buff = " ";
                }
            }

        }

        System.out.println(Arrays.deepToString(words));

    }
}