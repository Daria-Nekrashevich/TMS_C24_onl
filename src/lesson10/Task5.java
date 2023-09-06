package lesson10;
/*Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo".*/

public class Task5 {
    public static void main(String[] args) {
        String str = new String("Hello");
        String str2 = new String();
        for (int i = 0; i < str.length(); i++) {
            str2 += str.charAt(i);
            str2 += str.charAt(i);
        }
        System.out.println(str2);
    }
}
