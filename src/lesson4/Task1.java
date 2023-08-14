package lesson4;

import java.util.Arrays;
import java.util.Scanner;

//Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
public class Task1 {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println("Ваш массив:");
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[array.length];
        for (int i = 0, j = array.length - 1; j >= 0; i++, j--) {
            array2[i] = array[j];
        }
        System.out.println("Ваш массив в обратном порядке: ");
        System.out.println(Arrays.toString(array2));
    }

    public static int[] generateArray() {
        boolean work = true;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int sizeArr;
            System.out.println("Введите размер массива: ");
            if (scanner.hasNextInt()) {
                sizeArr = scanner.nextInt();
                int[] array;
                if (sizeArr <= 0) {
                    System.out.println("Размером массива не может быть отрицательное число. Попробуйте еще раз.");
                    continue;
                } else {
                    array = new int[sizeArr];
                    for (int i = 0; i < sizeArr; i++) {
                        array[i] =  Math.round((float) (Math.random() * 9));
                    }
                }
                return array;
            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте еще раз.");
            }

        }
    }

}
