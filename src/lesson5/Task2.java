package lesson5;

import java.util.Arrays;
import java.util.Random;

//Найдите сумму элементов на главной и побочной диагоналях
public class Task2 {
    public static void main(String[] args) {
        int[][] array = generateArray();
        System.out.println("Массив: ");
        System.out.println(Arrays.deepToString(array));
        int main_diag = 0, secondary_diag = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    main_diag += array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length - 1 == j + i) {
                    secondary_diag += array[i][j];
                }
            }
        }
        System.out.println("Сумма элементов на главной диагонали = " + main_diag + ", на побочной = " + secondary_diag);
    }

    public static int[][] generateArray() {
        Random random = new Random();
        int n = random.nextInt(9);
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
        return array;

    }
}
