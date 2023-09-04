package lesson8.task1;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();
        accountant.printJobTitle();
        director.printJobTitle();
        worker.printJobTitle();
    }
}
