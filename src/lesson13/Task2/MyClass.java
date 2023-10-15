package lesson13.Task2;

import java.util.List;

public class MyClass {
    private List<String> namesOfAnimals;

    public MyClass(List<String> namesOfAnimals) {
        this.namesOfAnimals = namesOfAnimals;
    }

    public List<String> getNamesOfAnimals() {
        return namesOfAnimals;
    }

    public void setNamesOfAnimals(List<String> namesOfAnimals) {
        this.namesOfAnimals = namesOfAnimals;
    }

    public void addInCollection(String str) {
        namesOfAnimals.add(0, str);
    }

    public void removeFromCollection(String str) {
        for (int i = namesOfAnimals.size() - 1; i >= 0; i--) {
            if (str.equals(namesOfAnimals.get(i))) {
                namesOfAnimals.remove(i);
            }
        }
    }
}

