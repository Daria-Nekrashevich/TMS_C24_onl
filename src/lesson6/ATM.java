package lesson6;

import java.util.Scanner;

public class ATM {
    int bankDen20;
    int bankDen50;
    int bankDen100;

    public ATM() {
        bankDen20 = 10;
        bankDen50 = 10;
        bankDen100 = 10;
    }


    public ATM(int den20, int den50, int den100) {
        bankDen20 = den20;
        bankDen50 = den50;
        bankDen100 = den100;
    }


     void plusBanknotes() {
        while(true) {
            System.out.println("Введите сумму, которую желаете добавить в банкомат: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int sum = scanner.nextInt();
                int bank20, bank50 = 0, bank100, ost;
                bank100 = sum / 100;
                if (((sum % 100) / 10) % 2 == 0) {
                    bank20 = (sum % 100) / 20;
                    ost = (sum % 100) % 20;
                } else {
                    bank50 = (sum % 100) / 50;
                    bank20 = ((sum % 100) % 50) / 20;
                    ost = ((sum % 100) % 50) % 20;
                }
                bankDen20 += bank20;
                bankDen50 += bank50;
                bankDen100 += bank100;
                System.out.println("Сумма добавлена " + bank20 + " купюрой(-ами) номиналом в 20$, " + bank50 + " купюрой(-ами) номиналом в 50$, " + bank100 + " купюрой(-ами) номиналом в 100$. Ос
                break;
            } else {
                System.out.println("Вы ввели не числовое значение. Попробуйте еще раз");
            }

        }
    }


    boolean minusBanknotes() {
        boolean operation;
        while (true) {
            System.out.println("Введите сумму, которую желаете снять: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int sum = scanner.nextInt();
                int summaATM = bankDen20 * 20 + bankDen50 * 50 + bankDen100 * 100;
                if (sum < summaATM) {

                    int bank20, bank50 = 0, bank100, ost;
                    bank100 = sum / 100;
                    if (((sum % 100) / 10) % 2 == 0) {
                        bank20 = (sum % 100) / 20;
                        ost = (sum % 100) % 20;
                    } else {
                        bank50 = (sum % 100) / 50;
                        bank20 = ((sum % 100) % 50) / 20;
                        ost = ((sum % 100) % 50) % 20;
                    }
                    bankDen20 -= bank20;
                    bankDen50 -= bank50;
                    bankDen100 -= bank100;
                    System.out.println("Сумма выдана " + bank20 + " купюрой(-ами) номиналом в 20$, " + bank50 + " купюрой(-ами) номиналом в 50$, " + bank100 + " купюрой(-ами) номиналом в 100$. Остаток суммы, который невозможно снять " + ost + "$");

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

