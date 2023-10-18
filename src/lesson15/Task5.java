package lesson15;

import java.util.Scanner;
import java.util.function.Supplier;

/*Используя Supplier написать метод, который будет возвращать введенную с консоли
строку задом наперед.*/
public class Task5 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            System.out.println("Enter a string: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            String str2 = new String();
            for (int i = str.length() - 1; i >=0; i--) {
                str2 += str.charAt(i);
            }
            return str2;
        };
        System.out.println(supplier.get());
    }
}
