package week9;

public class SchoolApp {
    public static void main(String[] args) {

        // Teacher object
        Teacher t = new Teacher(
                1, "Bilip", 30000, "Java", 20000);

        System.out.println("Teacher Annual Salary: " +
                t.calculateAnnualSalary());

        // Staff object
        Staff s = new Staff(
                2, "Rahul", 160, 500);

        System.out.println("Staff Salary: " +
                s.calculateSalary());

        // Print static college name
        System.out.println("College Name: " +
                Person.collegeName);
    }
}