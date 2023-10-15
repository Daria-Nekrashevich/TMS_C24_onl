package lesson14;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

/*Самостоятельно закрепить теоретически и практически фичи новых версий Java.*/
public class Main {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        System.out.println("Enter number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch(day) {
                case 1 -> System.out.println(list.get(0));
                case 2 -> System.out.println(list.get(1));
                case 3 -> System.out.println(list.get(2));
                case 4 -> System.out.println(list.get(3));
                case 5 -> System.out.println(list.get(4));
                case 6 -> System.out.println(list.get(5));
                case 7 -> System.out.println(list.get(6));
                default -> System.out.println("Wrong number");
            }
        } else {
            System.out.println("You enter not number");
        }

    }
}
