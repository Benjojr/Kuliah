import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.println("===================================");
        System.out.printf("%28s\n", "Welcome to FoodStream");
        System.out.print(" The Ultimate Food Ordering System");

        FoodStream foodStream = new FoodStream();
        boolean loop = true;
        while (loop) {
            foodStream.initialView();
            int choice = io.nextInt();
            io.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n\n====================================");
                    System.out.printf("%25s\n", "ADD A NEW ITEM");

                    boolean loop_addMenu = true;
                    while (loop_addMenu) {
                        System.out.println("====================================\n");
                        System.out.print("Enter the name of the menu item: ");
                        String food = io.nextLine();
                        System.out.print("Enter the price of the menu item: Rp ");
                        int price = io.nextInt();
                        System.out.println("\n-----------------------------------");

                        foodStream.addMenu(food, price);

                        System.out.println("Succesfully added \"" + food + "\" to menu!\n");

                        System.out.println("[1] Add New Menu Item");
                        System.out.println("[0] Back to Main Menu");
                        System.out.print("Your choice: ");
                        int choice1 = io.nextInt();
                        io.nextLine();
                        if (choice1 == 0)
                            loop_addMenu = false;
                    }
                    break;

                case 2:
                    System.out.println("\n\n===================================");
                    System.out.printf("%25s\n", "FOODSTREAM MENU");
                    System.out.println("===================================\n");

                    if (foodStream.displayMenu() == false)
                        System.out.println("No Menu Added");

                    System.out.print("Press [Enter] to return to main menu: ");
                    io.nextLine();
                    break;

                case 3:
                    boolean loop_order = true;
                    while (loop_order) {
                        System.out.println("\n====================================");
                        System.out.printf("%25s\n", "PLACE AN ORDER");
                        System.out.println("====================================\n");
                        boolean display = foodStream.displayMenu();
                        if (display) {
                            System.out.println("-----------------------------------");
                            System.out.print("\nEnter the menu number to order: ");
                            int order = io.nextInt();

                            System.out.print("Enter the quantity: ");
                            int quantity = io.nextInt();
                            System.out.println("-----------------------------------\n");

                            foodStream.placeOrder(order, quantity);

                            System.out.println("\n[1] Add Another Order");
                            System.out.println("[0] Back to Main Menu");
                            System.out.print("Your choice: ");
                            int choice2 = io.nextInt();
                            io.nextLine();
                            if (choice2 == 0)
                                loop_order = false;
                        } else {
                            System.out.println("No Menu Added");
                            System.out.print("Press [Enter] to return to main menu: ");
                            io.nextLine();
                            loop_order = false;
                        }
                    }
                    break;

                    case 4:
                    System.out.println("\n\n==================================");
                    System.out.printf("%23s\n", "YOUR ORDERS");
                    System.out.println("==================================\n");
                
                    if (!foodStream.viewOrder()) {
                        System.out.println("Haven't placed an order yet");
                    }
                    System.out.print("Press [Enter] to return to main menu: ");
                    io.nextLine();
                    break;                

                case 5:
                    System.out.println("\n\n===================================");
                    System.out.printf("%25s\n", "PAYMENT SUMMARY");
                    System.out.println("===================================\n");

                    if (!foodStream.paymentTotal()) {
                        System.out.println("Haven't placed an order yet");
                        System.out.print("Press [Enter] to return to main menu: ");
                        io.nextLine();
                        break;
                    }
                    boolean confirm = false;
                    while (!confirm) { // Loop selama pembayaran belum dikonfirmasi atau belum konfirmasi keluar
                        foodStream.paymentMenu();
                        int money = io.nextInt();
                        io.nextLine();

                        confirm = foodStream.confirmPayment(money); // Cek apakah pembayaran valid

                        if (confirm) {
                            foodStream.index_order=0;
                            System.out.println("\n\n-----------------------------------");
                            System.out.printf("%25s\n", "PAYMENT SUCCESS");
                            System.out.println("-----------------------------------\n");
                            System.out.println("Changes: Rp" + foodStream.change(money));
                            System.out.println("-----------------------------------\n");
                            System.out.println("Thank you for your payment!");
                            System.out.print("Press [Enter] to return to main menu: ");
                            io.nextLine();
                        } else {
                            System.out.println("\n\n-----------------------------------");
                            System.out.printf("%25s\n", "PAYMENT FAILED");
                            System.out.println("-----------------------------------\n");
                            System.out.println(
                                    "The amount you entered (Rp" + money + ") is less than the total payment (Rp"
                                            + (foodStream.total_payment + (foodStream.total_payment / 10)) + ")");
                            System.out.println("Please enter the correct amount to proceed.");
                            System.out.println("-----------------------------------\n");
                            System.out.println("Press [1] to retry: ");
                            System.out.println("Press [0] to return to the main menu");
                            System.out.print("Your choice: ");
                            int p = io.nextInt();
                            if(p==0)break;
                            io.nextLine();
                        }
                    }
                    break;

                case 6:
                    System.out.println("\n\n==============================");
                    System.out.printf("%20s\n", "THANK YOU!");
                    System.out.println("==============================\n");
                    System.out.println("Thank you for using FoodStream!");
                    System.out.println("We hope to serve you again soon.");
                    System.out.println("\n==============================");
                    loop = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again");
                    break;
            }
        }
    }
}