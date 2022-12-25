import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Restaurant resto = new Restaurant();
        int customerID, orderQty;
        try {

            System.out.print("Enter Customer ID: ");
            customerID = input.nextInt();

            System.out.print("Enter how much food to made: ");
            orderQty = input.nextInt();

            Thread t1 = new Thread(resto);
            waiters wait = new waiters(customerID, orderQty);
            Thread t2 = new Thread(wait);

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } catch (Exception e) {
            System.out.println("Input must be Integer");
        }

    }

}
