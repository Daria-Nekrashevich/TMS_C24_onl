package lesson15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

/*Используя Predicate среди массива чисел вывести только те, которые являются
положительными.*/
public class Task2 {
    public static void main(String[] args) {
        List<Integer> array = generateArrayList();
        System.out.println("Исходный массив: " + array);
        System.out.println("Положительные числа в массиве: ");
        Predicate<Integer> isEven = x -> x > 0;
        for (int i = 0; i < array.size(); i++) {
            if (isEven.test(array.get(i))) {
                System.out.print(array.get(i) + " ");
            }
        }
    }

    public static ArrayList<Integer> generateArrayList() {
        Random random = new Random();
        List<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(-100, 100));
        }
        return (ArrayList<Integer>) array;
    }
}
