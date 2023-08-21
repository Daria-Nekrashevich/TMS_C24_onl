package lesson5;

import java.util.Arrays;

//Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.
public class Task1 {
    public static void main(String[] args) {
        int[][][] array = {{{1, 3, 15, 16, 84}}, {{1, 2}, {46, 875, 45, 63, 78}, {7}}, {{6, 8, 97, 4}, {3, 2}}};
        System.out.println("Массив: ");
        System.out.println(Arrays.deepToString(array));
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    count++;
                }
            }
        }
        System.out.println("Количество ячеек в массиве = " + count);
    }
}
