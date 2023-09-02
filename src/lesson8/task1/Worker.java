package lesson8.task1;

public class Worker implements JobTitle{
    private String jobTitle;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(String jobTitle, String name) {
        this.jobTitle = jobTitle;
        this.name = name;
    }

    public Worker() {
        jobTitle = "Worker";
        name = "Ivan";
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public void printJobTitle() {
        System.out.println(name + " is " + jobTitle);
    }
}
