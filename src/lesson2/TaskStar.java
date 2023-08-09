package lesson2;

/*  Напишите программу, где пользователь вводит любое целое положительное число. А
    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
    ввести некорректные данные. */

import java.util.Scanner;

public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n > 0) {
                int sum = 0;
                for (int i = 1; i < n; i++) {
                    sum += i;
                }
                System.out.println("Результат выполнения: " + sum);
            } else {
                System.out.println("Вы ввели отрицательное число");
            }
        } else {
            System.out.println("Произошла ошибка. Скорее всего вы ввели не числовое значение");
        }
    }
}
