package lesson16;
/*Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
Stream'ов:
- Удалить дубликаты
- Оставить только четные элементы
- Вывести сумму оставшихся элементов в стриме*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 12, 15, -14, 6, 7, 8, 8, 8, 1, 13));
        Stream<Integer> streamList = list.stream().distinct();
        streamList.filter(x -> x % 2 == 0).forEach((x) -> System.out.print(x + " "));



    }
}
