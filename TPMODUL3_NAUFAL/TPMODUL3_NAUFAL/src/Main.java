import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Restaurant restaurant = new Restaurant();
            int IDcust, Order;
            
            try {

                System.out.println("Enter Customer ID: ");
                IDcust = input.nextInt();
                System.out.println("Enter how much food to made: ");
                Order = input.nextInt();
                Thread thr1 = new Thread(restaurant);
                Waiters waiters = new Waiters(IDcust, Order);
                Thread thr2 = new Thread(waiters);
                thr1.start();
                thr2.start();
                thr1.join();
                thr2.join();
            } catch (Exception e) {
                System.out.println("Input must be integer");
            }
        }
    }
}