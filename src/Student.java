public class Student
{
    private String name;
    private double gpa;

    public Student(String newName, double newGpa) {
        name = newName;
        gpa = newGpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double newGpa) { gpa = newGpa; }

    /* Additional methods not shown */
}