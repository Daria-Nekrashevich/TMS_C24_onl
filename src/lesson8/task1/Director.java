package lesson8.task1;

public class Director implements JobTitle {
    private String name;

    private String jobTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Director() {
        name = "Daria";
        jobTitle = "Director";
    }

    @Override
    public void printJobTitle() {
        System.out.println(name + " is " + jobTitle);
    }
}
