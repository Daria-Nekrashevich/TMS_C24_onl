package lesson2;

/* Необходимо, чтоб программа выводила на экран вот такую последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while. */

public class Task4 {
    public static void main(String[] args) {
        int k = 7;
        while (k <= 98) {
            System.out.println(k);
            k += 7;
        }
    }
}
