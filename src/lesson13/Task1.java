package lesson13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
При решении использовать коллекции.*/
public class Task1 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Введите числа через запятую: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] array = str.split(",");
                Set<String> set = new HashSet<String>();
                for (int i = 0; i < array.length; i++) {
                    set.add(array[i]);
                }
                System.out.println(set);
                break;

            } else {
                System.out.println("Вы ничего не ввели. Попробуйте еще раз");
            }
        }

    }
}
