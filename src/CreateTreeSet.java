import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class CreateTreeSet {
    public static void generateTreeSet() {

        Scanner keyboard = new Scanner(System.in);
        String name, city, zipCode;
        TreeSet<Customer> customerSet = new TreeSet<>();

        for (int x = 0; x <= 1; x++) {
            System.out.println("Please enter your name: ");
            name = keyboard.nextLine();
            System.out.println("Please enter your city: ");
            city = keyboard.nextLine();
            customerSet.add(new Customer(name, city, Math.round((Math.random() * 10000) * 100) / 100));
        }
        System.out.println("Beginning TreeSet output");

        System.out.println("Iterative list of customer: \n");
        for (Customer customers : customerSet) {
            System.out.println("Customer Name: " + customers.getName() +
                    "\tPurchase Amount: " + customers.getPurchase());
        }

        Iterator<Customer> customerIterator = customerSet.iterator();
        while (customerIterator.hasNext()) {
            Customer cust1 = customerIterator.next();
            System.out.println("Customer Name: " + cust1.getName() +
                    "\tPurchase Amount: " + cust1.getPurchase());
        }
        System.out.println("Ending TreeSet output");
    }
}