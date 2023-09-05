package lesson9;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Gav gav");
    }


    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog likes to eat meat");
        } else {
            System.out.println("Dog doesn't like the food you've offered him");
        }
    }
}
