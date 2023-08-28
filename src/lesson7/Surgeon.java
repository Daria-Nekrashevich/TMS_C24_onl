package lesson7;

public class Surgeon extends Doctor{
    @Override
    public void treat() {
        super.treat();
        System.out.println("The surgeon performed surgical treatment of diseases, advises patients, helps them get rid of medical problems using invasive or minimally invasive methods.");
    }
}
