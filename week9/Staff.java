package week9;

public class Staff extends Person {
    private int workingHours;
    private double ratePerHour;

    public Staff(int id, String name, int workingHours, double ratePerHour) {
        super(id, name, 0); // basicSalary not used for staff
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }

    public double calculateSalary() {
        return workingHours * ratePerHour;
    }
}
