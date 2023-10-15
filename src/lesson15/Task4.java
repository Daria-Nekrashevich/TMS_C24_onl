package lesson15;

import java.util.function.Consumer;

/*Используя Consumer реализовать лямбду, которая будет принимать в себя строку в
формате “*сумма* BYN”(через пробел, вместо *сумма* вставить любое значение), а
выводить сумму, переведенную сразу в доллары.*/
public class Task4 {
    public static void main(String[] args) {
        Consumer<String> converter = x -> System.out.println(Integer.parseInt(x.substring(0, x.indexOf(" "))) / 3 + " $");
        converter.accept("1500 BYN");
    }
}
