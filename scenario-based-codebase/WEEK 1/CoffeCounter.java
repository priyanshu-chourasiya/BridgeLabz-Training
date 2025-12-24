import java.util.*;

public class CoffeCounter {

    // Total bill
    public static void totalBill(int price, int quantity, double gst, String coffee) {
        System.out.println("Coffee : " + coffee);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantity);
        System.out.println("Initial price : " + price * quantity);
        System.out.println("After GST : " + (price * quantity + gst));
    }

    // serving coffee
    public static void serving(int quantity, String coffee) {
        int i = 0;
        while (i < quantity) {
            System.out.println("Serving : " + coffee + " " + i);
            i++;
        }
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("--Enter Coffee--");
            System.out.println("1. Cold coffee (Rs. 700)");
            System.out.println("2. Hot coffee (Rs. 500)");
            System.out.println("3. Mocha (Rs. 1200)");
            System.out.println("4. Espresso (Rs. 1700)");

            String coffee1 = input.next();

            if (coffee1.equalsIgnoreCase("exit")) {
                System.out.println("Thank you!");
                break; 
            }

            int coffee = Integer.parseInt(coffee1);

            System.out.print("Enter quantity : ");
            int quantity = input.nextInt();

            switch (coffee) {

                case 1:
                    totalBill(700, quantity, 25.2, "Cold coffee");
                    serving(quantity, "Cold coffee");
                    break;

                case 2:
                    totalBill(500, quantity, 2.5, "Hot coffee");
                    serving(quantity, "Hot coffee");
                    break;

                case 3:
                    totalBill(1200, quantity, 2.5, "Mocha");
                    serving(quantity, "Mocha");
                    break;

                case 4:
                    totalBill(1700, quantity, 2.5, "Espresso");
                    serving(quantity, "Espresso");
                    break;

                default:
                    System.out.println("Invalid");
            }
        }

        input.close();
    }
}
