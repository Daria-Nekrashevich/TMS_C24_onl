package lesson13.Task3;
/*Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> students = generateList();
        System.out.println("Список студентов: ");
        printStudents((ArrayList<Student>) students);
        operationsWithGPA((ArrayList<Student>) students);
        System.out.println("Список студентов после манипуляций со средним баллом: ");
        printStudents((ArrayList<Student>) students);
        System.out.println("Список студентов, учащихся на пятом курсе: ");
        printStudents(students, 5);

    }

    public static void printStudents(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            students.get(i).printStudent();
        }
    }

    public static ArrayList<Student> generateList() {
        List<Student> students = new ArrayList<Student>();
        int[] array1 = generateArray();
        Student student1 = new Student("Ivan", "32i", 3, array1);
        int[] array2 = generateArray();
        Student student2 = new Student("Angelina", "21u", 2, array2);
        int[] array3 = generateArray();
        Student student3 = new Student("Diana", "48t", 4, array3);
        int[] array4 = generateArray();
        Student student4 = new Student("Daria", "42o", 4, array4);
        int[] array5 = generateArray();
        Student student5 = new Student("Anatoli", "12v", 1, array5);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        return (ArrayList<Student>) students;
    }

    public static int[] generateArray() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1,10);
        }
        return array;
    }

    public static void operationsWithGPA(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).GPA() < 3) {
                students.remove(i);
            } else {
                students.get(i).upperCourse();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCourse() == course) {
                students.get(i).printStudent();
            }
        }
    }
}
