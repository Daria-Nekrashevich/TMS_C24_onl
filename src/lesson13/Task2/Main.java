package lesson13.Task2;
/*Создать класс, который будет хранить в себе коллекцию с названиями животных.
Реализовать методы удаления и добавления животных по следующим правилам:
добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
объекта этого класса в main методе другого класса.*/

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        MyClass myClass = new MyClass(list);
        myClass.addInCollection("Tiger");
        myClass.addInCollection("Dog");
        myClass.addInCollection("Fox");
        myClass.addInCollection("Cat");
        myClass.removeFromCollection("Dog");
        System.out.println(myClass.getNamesOfAnimals());
    }
}
