package lesson9;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Squeak");
    }


    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit likes to eat grass");
        } else {
            System.out.println("Rabbit doesn't like the food you've offered him");
        }
    }
}
