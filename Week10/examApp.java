package Week10;


/**
 * Write a description of class examkoapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class examApp {
    public static void main(String[] args) {
        scienceStudent science = new scienceStudent(101, "Bilip", 99);
        managementStudent management = new managementStudent(201, "BOy", 43);

        System.out.println(science);
        System.out.println("Science Result: " + science.calculateResult());
        System.out.println("Science Result with grace: " + science.calculateResult(3));

        System.out.println(management);
        System.out.println("Management Result: " + management.calculateResult());
        System.out.println("Management Result with Grace: " + management.calculateResult(12));
    }
}