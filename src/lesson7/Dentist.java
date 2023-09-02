package lesson7;

public class Dentist extends Doctor{
    @Override
    public void treat() {
        super.treat();
        System.out.println("Dentist successfully cured an undeveloped form of dental disease");
    }
}
