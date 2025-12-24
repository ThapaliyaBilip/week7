package week8;

public class HospitalTest
{
    

    public static void main(String[] args) {

        Patient p1 = new Patient("ABilip Thapaliya", 22, 5, 2000);
        Patient p2 = new Patient("Girish Shrestha", 35, 10, 1800);

        p1.displayDetails();
        System.out.println("Total Bill:Rs. " + p1.calculateTotalBill());
        System.out.println();

        p2.displayDetails();
        System.out.println("Total Bill: Rs. " + p2.calculateTotalBill());
    }

}