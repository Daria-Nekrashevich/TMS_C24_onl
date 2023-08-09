package lesson2;

// Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

public class Task3 {
    public static void main(String[] args) {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Число " + i + " в квадрате = " + (int) Math.pow(i, 2));
        }
    }
}
