package lesson10;
/* Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
найденные строки и их длину.*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] array = generateArray();
        printArray(array);
        String min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min.length()) {
                min = array[i];
            }
        }
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        System.out.println("Самая длинная строка: " + max + "; её длина составляет " + max.length() + " символа(-ов).");
        System.out.println("Самая короткая строка: " + min + "; её длина составляет " + min.length() + " символа(-ов).");
    }

    public static String[] generateArray() {
        Scanner scanner = new Scanner(System.in);
        String[] array = new String[3];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + (i + 1) + " строку: ");
            array[i] = scanner.nextLine();
        }
        return array;
    }

    public static void printArray (String[] array) {
        System.out.println("Ваши строки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }
}
