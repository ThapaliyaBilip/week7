package week7;

public class Bankmain {
    public static void main(String[] args) {

        bankaccount z1 = new bankaccount(34516, "Aryan", 1000000);
        bankaccount z2 = new bankaccount(12345, "Muskan", 100000);

        System.out.println("Accnumber =" + z1.num + "\n" +
                           "Name =" + z1.name + "\n" +
                           "Balance =" + z1.balance);
        z1.deposit(5000);
        z1.withdraw(10000);
        z1.disbalance();

        System.out.println("Accnumber =" + z2.num + "\n" +
                           "Name =" + z2.name + "\n" +
                           "Balance =" + z2.balance);
        z2.deposit(50000);
        z2.withdraw(100000);
        z2.disbalance();
    }
}