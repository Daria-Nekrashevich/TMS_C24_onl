package lesson16;

import java.util.*;
import java.util.stream.Collectors;


/*Создать набор данных в формате id-name, сохраненный в Map. Необходимо отобрать из
этого набора только те данные, id которых попадает в числовой диапазон 1/2/5/8/9/13.
Среди отобранных значений отобрать только те, которые имеют нечетное количество
букв в имени. После чего вернуть список List имен, записанных буквами задом наперед.*/
public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> mapIdName = createMap();
        Map<Object, Object> map = mapIdName.entrySet().stream().filter((x) -> x.getKey() == 1 || x.getKey() == 2
        || x.getKey() == 5 || x.getKey() == 8 || x.getKey() == 9 || x.getKey() == 13).filter((y) -> y.getValue().length() % 2 != 0).collect(Collectors.toMap(y -> y.getKey(), e -> new StringBuilder(e.getValue()).reverse().toString()));
        List<Map.Entry<Object, Object>> list = map.entrySet().stream().toList();
        System.out.println(list);
        
    }

    public static Map<Integer, String> createMap() {
        Map<Integer, String> map = new HashMap<>();
        ArrayList<Integer> arrayKey = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15));
        ArrayList<String> arrayValue = new ArrayList<>(Arrays.asList("Daria", "Diana", "Angelina", "Slava", "Vitaly", "Dmitry", "Alex", "German", "Maxim", "Anatoly", "Svetlana", "Irina", "Liza", "Maria", "Ivan"));
        for (int i = 0; i < arrayKey.size(); i++) {
            map.put(arrayKey.get(i), arrayValue.get(i));
        }
        return map;
    }


}
