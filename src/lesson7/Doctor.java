package lesson7;

public class Doctor {
    private String name;
    private String surname;

    public Doctor() {
        name = "";
        surname = "";
    }

    public Doctor(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void treat() {
        System.out.println("Treatment was successful");
    }
}


