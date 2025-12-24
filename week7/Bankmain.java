package week7;

public class Bankmain {
    public static void main(String[] args) {

        bankaccount s1 = new bankaccount(34516, "Bilip", 500000);
        bankaccount s2 = new bankaccount(12345, "Girish", 10000);

        System.out.println("Accnumber =" + s1.num + "\n" +
                           "Name =" + s1.name + "\n" +
                           "Balance =" + s1.balance);
        s1.deposit(5000);
        s1.withdraw(10000);
        s1.disbalance();

        System.out.println("Accnumber =" + s2.num + "\n" +
                           "Name =" + s2.name + "\n" +
                           "Balance =" + s2.balance);
        s2.deposit(50000);
        s2.withdraw(100000);
        s2.disbalance();
    }
}