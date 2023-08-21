package lesson5;

import java.util.Arrays;
import java.util.Scanner;

/*Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
Формат входных данных:
Программа получает на вход два числа n и m.
Формат выходных данных:
Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
символа.*/
public class TaskStar {
     public static void main(String[] args) {
         boolean work = true;
         while(work){
             Scanner scanner1 = new Scanner(System.in);
             Scanner scanner2 = new Scanner(System.in);
             int n, m;
             System.out.println("Введите количество строк и столбцов: ");
             if (scanner1.hasNextInt() && scanner2.hasNextInt()) {
                 n = scanner1.nextInt();
                 m = scanner2.nextInt();
                 int[][] array = new int[n][m];
                 int num = 0;
                 for (int i = 0; i < array.length; i++) {
                     for (int j = 0; j < array[i].length; j++) {
                         array[i][j] = num;
                         num++;
                         System.out.printf("%3d", array[i][j]);
                     }
                     System.out.println();
                 }
                 break;

             } else {
                 System.out.println("Вы ввели не числовое значение. Попробуйте еще раз.");
             }
         }

     }
}
