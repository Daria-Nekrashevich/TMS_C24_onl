package lesson15;

import java.util.function.Function;

/*Используя Function реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
возвращать сумму, переведенную сразу в доллары.*/
public class Task3 {
    public static void main(String[] args) {
        Function<String, Integer> converter = x -> Integer.parseInt(x.substring(0, x.indexOf(" "))) / 3;
        int result = converter.apply("500 BYN");
        System.out.println(result + " $");
    }
}
