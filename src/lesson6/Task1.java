package lesson6;

/*Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
выводит текущую информацию о карточке. Напишите программу, которая создает три
объекта класса CreditCard у которых заданы номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
третьей. Выведите на экран текущее состояние всех трех карточек.*/

public class Task1 {
    public static void main(String[] args) {
        String num1 = "NB4560", num2 = "44120028AK", num3 = "46561MH04";
        int summa1 = 105655, summa2 = 415, summa3 = 4866;
        CreditCard card1 = new CreditCard(num1, summa1), card2 = new CreditCard(num2, summa2), card3 = new CreditCard(num3, summa3);
        card1.plusSumma();
        card2.plusSumma();
        card3.minusSumma();
        card1.infoCard();
        card2.infoCard();
        card3.infoCard();
    }

}