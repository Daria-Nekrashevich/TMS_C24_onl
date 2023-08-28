package lesson7;

public class Main {
    public static void main(String[] args) {
        Patient object = new Patient();
        object.setName("Daria");
        object.setSurname("Nekrashevich");
        object.setTreatmentPlan(2);
        Therapist obj = new Therapist();
        obj.doctorAppointment(object);
    }
}
