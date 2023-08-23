package lesson6;

import java.util.Scanner;

public class CreditCard {
    String accountNumber;
    int summa;

    CreditCard() {
        accountNumber = "";
        summa = 0;
    }

    CreditCard(String accountNumber1, int summa1) {
        accountNumber = accountNumber1;
        summa = summa1;
    }

    void plusSumma() {
        boolean work = true;
        while (work) {
            System.out.println("Введите сумму, которую желаете зачислить на карту по номеру " + accountNumber + " :");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                summa += n;
                System.out.println("На карту зачислено " + n + "$");
                break;

            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте ещё раз");
            }
        }
    }

    void minusSumma() {
        boolean work = true;
        while (work) {
            System.out.println("Введите сумму, которую желаете снять с карты по номеру " + accountNumber + " :");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                summa -= n;
                System.out.println("С карты снято " + n + "$");
                break;

            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте ещё раз");
            }
        }
    }

    void infoCard(){
        System.out.println("На счету " + accountNumber + " находится " + summa + "$");
    }


}