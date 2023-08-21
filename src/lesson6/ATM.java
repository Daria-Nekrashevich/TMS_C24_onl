package lesson6;

import java.util.Scanner;

public class ATM {
    int bankDen20;
    int bankDen50;
    int bankDen100;

    ATM() {
        bankDen20 = 10;
        bankDen50 = 10;
        bankDen100 = 10;
    }

    ATM(int den20, int den50, int den100) {
        bankDen20 = den20;
        bankDen50 = den50;
        bankDen100 = den100;
    }

    void plusBanknotes() {
        boolean work = true;
        while(work) {
            System.out.println("Введите сумму, которую желаете добавить в банкомат: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int sum = scanner.nextInt();
                int bank100 = sum / 100;
                int bank50 = (sum % 100) / 50;
                int bank20 = ((sum % 100) % 50) / 20;
                bankDen20 += bank20;
                bankDen50 += bank50;
                bankDen100 += bank100;
                System.out.println("Сумма добавлена " + bank20 + " купюрой(-ами) номиналом в 20$, " + bank50 + " купюрой(-ами) номиналом в 50$, " + bank100 + " купюрой(-ами) номиналом в 100$.");
                break;
            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте еще раз");
            }

        }
    }

    public boolean minusBanknotes() {
        boolean operation = false;
        int k;
        boolean work = true;
        while (work) {
            System.out.println("Введите сумму, которую желаете снять: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int sum = scanner.nextInt();
                int summaATM = bankDen20 * 20 + bankDen50 * 50 + bankDen100 * 100;
                if (sum < summaATM) {
                    int bank100 = sum / 100;
                    int bank50 = (sum % 100) / 50;
                    int bank20 = ((sum % 100) % 50) / 20;
                    bankDen20 -= bank20;
                    bankDen50 -= bank50;
                    bankDen100 -= bank100;
                    System.out.println("Сумма выдана " + bank20 + " купюрой(-ами) номиналом в 20$, " + bank50 + " купюрой(-ами) номиналом в 50$, " + bank100 + " купюрой(-ами) номиналом в 100$.");
                    operation = true;
                    break;
                } else {
                    System.out.println("К сожалению, в банкомате нет суммы, которую вы желаете снять");
                    operation = false;

                }

            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте еще раз");
            }

        }
        return operation;
    }
}
