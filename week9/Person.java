package week9;

public class Person {
    protected int id;
    protected String name;
    protected double basicSalary;
    protected static String collegeName = "ABC College";

    // Constructor
    public Person(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Calculate annual salary
    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }
}
