package lesson13.Task3;
/*Создать класс Student, содержащий следующие характеристики – имя, группа, курс,
оценки по предметам. Создать коллекцию, содержащую объекты класса Student.
Написать метод, который удаляет студентов со средним баллом <3. Если средний
балл>=3, студент переводится на следующий курс. Дополнительно написать метод
printStudents(List<Student> students, int course), который получает список студентов и
номер курса. А также печатает на консоль имена тех студентов из списка, которые
обучаются на данном курсе.*/

import java.util.Arrays;

public class Student {
    private String name;
    private String groupName;
    private int course;
    private int[] marks;

    public Student() {
    }

    public Student(String name, String groupName, int course, int[] marks) {
        this.name = name;
        this.groupName = groupName;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int GPA() {
        int buff = 0;
        for (int i = 0; i < marks.length; i++) {
            buff += marks[i];
        }
        int gpa = buff / marks.length;
        return gpa;
    }

    public void upperCourse() {
        this.course += 1;
    }

    public void printStudent() {
        System.out.println("Name: " + name + "\tGroup: " + groupName + "\tCourse: " + course + "\tMarks" + Arrays.toString(marks));
    }
}
