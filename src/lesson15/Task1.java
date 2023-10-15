package lesson15;
/*Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
когда пользователю исполнится 100 лет. Использовать Date/Time API.*/

import java.time.LocalDate;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Enter your date of birthday: ");
        Scanner scanner = new Scanner(System.in);
        LocalDate date = LocalDate.parse(scanner.nextLine());
        System.out.println("You will be 100 years old on " + date.plusYears(100));
    }
}
