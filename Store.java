

import java.util.InputMismatchException;
import java.util.Scanner;


public class Store {



    void main(String[] args){

        final double mouse = 20;
        final double keyboard = 40;
        final double headphones = 50;
        final double laptop = 30;

        double subtotal = 0;
        short items = 0;

        short Mouse = 0;
        short Keyboard = 0;
        short Headphones = 0;
        short Laptop = 0;



        Scanner scanner = new Scanner(System.in);


        int choice = 0;
        while (choice != 5) {
            System.out.println();
            System.out.println("===== SIMPLE STORE =====");
            System.out.println("1. Mouse - $20");
            System.out.println("2. Keyboard - $40");
            System.out.println("3. Headphones - $50");
            System.out.println("4. Laptop Stand - $30");
            System.out.println("5. Checkout");
            System.out.print("Choose an option: ");

            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Invalid option. Please enter a number from 1 to 4.");
                choice = 0;
                continue;
            }

            String name;
            double price;

            if (choice == 1) {
                name = "Mouse";
                price = mouse;
            } else if (choice == 2) {
                name = "Keyboard";
                price = keyboard;
            } else if (choice == 3) {
                name = "Headphones";
                price = headphones;
            } else if(choice == 4) {
                name = "Laptop Stand";
                price = laptop;
            }else{
                break;
            }

            System.out.println("You selected: " + name);
            System.out.println("Price: $" + (int) price);
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            if (quantity <= 0) {
                System.out.println("Invalid quantity.");
                System.out.println("Quantity must be greater than 0.");
                continue;
            }

            double itemCost = quantity * price;

            if (quantity >= 5) {
                itemCost = itemCost * 0.95;
                System.out.println("Bulk discount: 5% off this purchase!");
            }
            subtotal += itemCost;
            items += quantity;

            if (choice == 1) {
                Mouse += quantity;
            } else if (choice == 2) {
                Keyboard += quantity;
            } else if (choice == 3) {
                Headphones += quantity;
            } else {
                Laptop += quantity;
            }
            System.out.printf("%d x $%d = $%.2f%n", quantity, (int) price, itemCost);
            System.out.println("Added to cart!");
            System.out.printf("Current total: $%.2f%n", subtotal);



        }
        System.out.println("===== CHECKOUT =====");
        System.out.println("Items purchased: " + items);
        System.out.printf("Subtotal: $%.2f%n", subtotal);


        System.out.println("===== CHECKOUT =====");
        System.out.println("Items purchased: " + items);
        System.out.printf("Subtotal: $%.2f%n", subtotal);


        double discount;
        if (subtotal >= 200) {
            discount = subtotal * 0.15;
            System.out.println("You received a 15% discount!");
        } else if (subtotal >= 100) {
            discount = subtotal * 0.10;
            System.out.println("You received a 10% discount!");
        } else {
            discount = 0;
        }
        double finalTotal = subtotal - discount;

        System.out.printf("Discount: $%.2f%n", discount);
        System.out.printf("Final total: $%.2f%n", finalTotal);


        double payment;
        while (true) {
            System.out.print("Enter payment amount: $");
            payment = scanner.nextDouble();


            if (payment >= finalTotal) {
                break; // enough money
            }
            System.out.println("Insufficient payment.");
            System.out.printf("You still need to pay: $%.2f%n", finalTotal - payment);
        }
        double change = payment - finalTotal;
        System.out.println("Payment successful!");

        System.out.println("========================");
        System.out.println(" SIMPLE STORE");
        System.out.println("========================");
        System.out.println("Items purchased: " + items);
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Discount: $%.2f%n", discount);
        System.out.printf("Final total: $%.2f%n", finalTotal);
        System.out.printf("Payment: $%.2f%n", payment);
        System.out.printf("Change: $%.2f%n", change);
        System.out.println("========================");
        System.out.println("Thank you for shopping!");
        System.out.println("========================");

        System.out.println("===== ITEMS PURCHASED =====");
        System.out.println("Mouse: " + Mouse);
        System.out.println("Keyboard: " + Keyboard);
        System.out.println("Headphones: " + Headphones);
        System.out.println("Laptop Stand: " + Laptop);


        if (items > 0) {
            String topName;
            int topQty;
            if (Mouse > Keyboard && Mouse > Headphones && Mouse > Laptop) {
                topName = "Mouse";
                topQty = Mouse;
            } else if (Keyboard > Headphones && Keyboard > Laptop) {
                topName = "Keyboard";
                topQty = Keyboard;
            } else if (Headphones > Laptop) {
                topName = "Headphones";
                topQty = Headphones;
            } else {
                topName = "Laptop Stand";
                topQty = Laptop;
            }
            System.out.println("Most purchased product: " + topName);
            System.out.println("Quantity: " + topQty);
        }

        if (items >= 10) {
            System.out.println("You earned a $10 coupon for your next visit!");
        }

        scanner.close();
    }


}
