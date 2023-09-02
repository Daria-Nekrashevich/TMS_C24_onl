package lesson7;

public class Therapist extends Doctor {
    @Override
    public void treat() {
        super.treat();
        System.out.println("The therapist successfully carried out the primary diagnosis and treatment of diseases of the internal organs.");
    }

    public void doctorAppointment(Patient object) {
        if(object.getTreatmentPlan() == 1) {
            object.setDoctor("Surgeon");
            Surgeon surg = new Surgeon();
            surg.treat();
        } else if(object.getTreatmentPlan() == 2) {
            object.setDoctor("Dentist");
            Dentist dent = new Dentist();
            dent.treat();
        } else {
            object.setDoctor("Therapist");
            Therapist obj = new Therapist();
            obj.treat();
        }


    }
}
