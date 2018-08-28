public class DreamVacation {
    private String destination;
    private double costOfVacation;

    public DreamVacation() {
        this("None", 0);
    }

    public DreamVacation(String destination, double costOfVacation) {
        this.destination = destination;
        this.costOfVacation = costOfVacation;
    }

    public double getCostOfVacation() {
        return costOfVacation;
    }

    public String getDestination() {
        return destination;
    }

    public void setCostOfVacation(double costOfVacation) {
        this.costOfVacation = costOfVacation;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}