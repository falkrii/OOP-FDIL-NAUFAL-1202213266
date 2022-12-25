public class Waiters implements Runnable {

    private final int Order;
    private final int IDcust;
    static int harga = 23000;

    public Waiters(int IDcust, int Order) {
        this.IDcust = IDcust;
        this.Order = Order;
    }

    @Override
    public void run() {
        while (true) {
            getFood();
            try {
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void orderInfo() {
System.out.println("================================================================");
        System.out.println("Customer ID : " + this.IDcust);
        System.out.println("Number of food : " + this.Order);
        System.out.println("Total Price : " + this.Order * harga);
System.out.println("================================================================");
    }
    public void getFood() {
        synchronized(Restaurant.getLock()) {

            System.out.println("Waiter:Food is already to deliver ");
            Restaurant restaurant = new Restaurant();
            restaurant.setWaitingForPickup(false);

            if (Restaurant.getNumfood() == this.Order +1) {
                orderInfo();
                System.exit(0);
            }
            Restaurant.getLock().notifyAll();
            System.out.println("Waiter: Tell the Restaurant to make another food\n");
            
        }

    }
    
}
