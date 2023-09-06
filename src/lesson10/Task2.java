package lesson10;
/*Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
значений их длины.*/

import java.util.Arrays;

import static lesson10.Task1.generateArray;
import static lesson10.Task1.printArray;

public class Task2 {
    public static void main(String[] args) {
        String[] array = generateArray();
        printArray(array);
        String buff = new String();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].length() > array[i + 1].length()) {
                    isSorted = false;
                    buff = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buff;
                }
            }
        }

        System.out.println("Порядок возрастания: ");
        printArray(array);

    }
}
