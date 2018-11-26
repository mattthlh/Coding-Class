public class Student
{
    private String name;
    private double gpa;
    private static String college = "UBC";

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

    public String toString(){
        return this.name + this.gpa + this.college;
    }
    /* Additional methods not shown */
}