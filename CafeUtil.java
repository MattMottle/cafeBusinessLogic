import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
    public double getOrderTotal(double[] lineItems) {
        double total = 0;
        for(int i = 0; i < lineItems.length; i++) {
            total += lineItems[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menu) {
        for(int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name.");
        String username = System.console().readLine();
        System.out.printf("Hello, %s!", username);
        int orderNumber = customers.size();
        System.out.printf(" There are %s people in front of you. \n", orderNumber);
        customers.add(username);
        System.out.println(customers);
    }
    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        double sum = 0;
        for(double i = 1; i <= maxQuantity; i++) {
            if(i > 1) {
                sum = (price * i) - (i * .5);
            }
            else {
                sum = price * i;
            }
            System.out.printf("%.0f - $%.2f \n", i, sum);
        }
    }
}