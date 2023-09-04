package lesson9;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Rrrrr");
    }


    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Tiger likes to eat meat");
        } else {
            System.out.println("Tiger doesn't like the food you've offered him");
        }
    }
}
