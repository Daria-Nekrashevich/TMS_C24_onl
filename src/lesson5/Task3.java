package lesson5;
/*1.1 Создать двумерный массив, заполнить его случайными числами.
1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/

import java.util.Arrays;
import java.util.Scanner;

import static lesson5.Task2.generateArray;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.deepToString(array));
        boolean work = true;
        while(work){
            Scanner scanner = new Scanner(System.in);
            int num;
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        array[i][j] += num;
                    }
                }
                System.out.println("Измененный массив: ");
                System.out.println(Arrays.deepToString(array));
                int sum = 0;
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        sum += array[i][j];
                    }
                }
                System.out.println("Сумма элементов массива = " + sum);
                break;
            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте еще раз.");
            }
        }

    }
}
