package lesson10;
/*Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
средней, а также их длину.*/

import static lesson10.Task1.generateArray;
import static lesson10.Task1.printArray;

public class Task3 {
    public static void main(String[] args) {
        String[] array = generateArray();
        printArray(array);
        int average = (array[0].length() + array[1].length() + array[2].length()) / 3;
        System.out.println("Средняя длина строк: " + average);
        System.out.println("Строки, длина которых меньше средней: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < average) {
                System.out.println((i + 1) + ". " + array[i] + "\n" + "Длина этой строки: " + array[i].length());
            }
        }
    }
}
