public class FoodStream {
    private String[] menu = new String[100];
    private int[] price = new int[100];
    private int index = 0;
    private String[] order = new String[100];
    private int[] price_order = new int[100];
    private int[] order_quantity = new int[100];
    public int index_order = 0;
    public int total_payment = 0;
    private int total_order = 0;

    public void initialView() {
        System.out.println("\n===================================\n");
        System.out.println("1. Add New Menu Item");
        System.out.println("2. View Menu");
        System.out.println("3. Place an Order");
        System.out.println("4. View Orders");
        System.out.println("5. Payment");
        System.out.println("6. Exit\n");
        System.out.println("-----------------------------------");
        System.out.print("Please select an option: ");
    }

    public void addMenu(String food, int harga) {
        menu[index] = food;
        price[index] = harga;
        index++;
    }

    public boolean displayMenu() { // Menampilkan list makanan
        if (index == 0) {
            return false;
        } else {
            System.out.println("Available menu: ");
            for (int i = 0; i < index; i++) {
                System.out.printf("%d. %-25s%s%s\n", (i + 1), menu[i], "- Rp", price[i]);
            }
            return true;
        }
    }

    public void placeOrder(int order_num, int quantity) {
        // Menerima order
        order[index_order] = menu[order_num - 1];
        order_quantity[index_order] = quantity;
        price_order[index_order] = price[order_num - 1] * quantity;

        // Cetak hasil order
        System.out.println("Order added: " + order[index_order] + " x" + order_quantity[index_order]);
        index_order++;
    }

    public boolean viewOrder() {
        // Menampilkan list
        if (index_order == 0) {
            return false;// Belum ada pesanan yang ditambahkan
        } else {
            for (int i = 0; i < index_order; i++) {
                System.out.printf("%d. %-25s%s %d = Rp %d\n", (i + 1), order[i], "x", order_quantity[i],
                        price_order[i]);
            }
            paymentTotal();
            System.out.printf("%-32s= Rp %d\n", "Subtotal (Before Task)", total_payment); 
            return true;
        }
    }

    public void paymentMenu() {
        System.out.println("Orders: ");
        for (int i = 0; i < index_order; i++) {
            System.out.printf("%d. %-25s%s %d  = Rp %d\n", (i + 1), order[i], "x", order_quantity[i],
                    price_order[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Total Orders:" + total_order);
        System.out.println("Subtotal:\t\tRp" + total_payment);
        System.out.println("Tax (10%):\t\tRp" + (total_payment / 10));
        System.out.println("-----------------------------------");
        System.out.println("Total Payment:\t\tRp" + (total_payment + (total_payment / 10)) + "\n");
        System.out.print("Enter the amount money: Rp ");
    }

    public boolean paymentTotal() {
        if (index_order == 0) {
            return false;
        } else {
            total_payment = 0; // Reset sebelum menghitung
            total_order = 0;
            for (int i = 0; i < index_order; i++) {
                total_payment += price_order[i];
                total_order += order_quantity[i];
            }
            return true;
        }
    }

    public boolean confirmPayment(int money) {
        int totalWithTax = total_payment + (total_payment / 10); // Total termasuk pajak
        return money >= totalWithTax;
    }

    public int change(int money) {
        return money - (total_payment + (total_payment / 10));
    }
}
