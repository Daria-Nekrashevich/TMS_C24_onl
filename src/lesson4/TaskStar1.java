package lesson4;

import java.util.Arrays;

import static lesson4.Task1.generateArray;

/*Имеется массив из неотрицательных чисел(любой). Представьте что массив
представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
содержит нуля в начале, кроме самого числа 0.
Пример:
Input: [1,4,0,5,6,3]
Output: [1,4,0,5,6,4]
Input: [9,9,9]
Output: [1,0,0,0]*/
public class TaskStar1 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println("Ваш массив: ");
        System.out.println(Arrays.toString(arr));
        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            str += Integer.toString(arr[i]);
        }
        int buff = Integer.parseInt(str);
        buff++;
        str = Integer.toString(buff);
        int[] arr2 = new int[str.length()];
        char[] chars = str.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Character.getNumericValue(chars[i]);
        }
        System.out.println("Исправленный массив: ");
        System.out.println(Arrays.toString(arr2));
    }
}
