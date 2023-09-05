package lesson9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();
        animal.voice();
        animal.eat();
        System.out.print("The dog makes a sound = ");
        dog.voice();
        System.out.println("Enter what you want to feed your dog: ");
        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();
        dog.eat(str);
        System.out.print("The tiger makes a sound = ");
        tiger.voice();
        System.out.println("Enter what you want to feed your tiger: ");
        String str2 = scanner1.nextLine();
        tiger.eat(str2);
        System.out.print("The rabbit makes a sound = ");
        rabbit.voice();
        System.out.println("Enter what you want to feed your rabbit: ");
        String str3 = scanner1.nextLine();
        rabbit.eat(str3);

    }
}
