public class Main {
    public static void main(String[] args) {
        Customer Cust1 = new Customer(1, "Budi", "budi@gmail.com");
        Customer Cust2 = new Customer(2, "Bagus", "bagus@gmail.com");
        Customer Cust3 = new Customer(3, "Ayu", "ayu@gmail.com");

        Order Od1 = new Order(1, "21-02-2025", 40000, null);
        Order Od2 = new Order(2, "21-02-2025", 28000, Cust1);

        OrderItem OdIt1 = new OrderItem(1, Od1, 1, "Pepsodent", 20000, 2);
        OrderItem OdIt2 = new OrderItem(2, Od2, 3, "SariRoti", 14000, 2);

        Cust1.printCustomer();
        Cust2.printCustomer();
        Cust3.printCustomer();

        Od1.printOrder();
        Od2.printOrder();

        OdIt1.printOrderItem();
        OdIt2.printOrderItem();

    }
}

class Customer {
    private int custID;
    private String nama;
    private String email;

    public Customer(int custID, String nama, String email) {
        this.custID = custID;
        this.nama = nama;
        this.email = email;
    }

    public int getCustID() {
        return custID;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public void printCustomer() {
        System.out
                .println(this.getNama() + "(" + this.getCustID() + "," + this.getNama() + "," + this.getEmail() + ")");
    }
}

class Order {
    private int orderId;
    private String date;
    private int totalAmount;
    private Customer customer;

    public Order(int orderId, String date, int totalAmount, Customer customer) {
        this.orderId = orderId;
        this.date = date;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public int getOrderID() {
        return orderId;
    }

    public String getDate() {
        return date;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void printOrder() {
        System.out.println(
                this.getOrderID() + "(" + this.getOrderID() + "," + this.getDate() + "," + this.getTotalAmount() + ","
                        + ((this.getCustomer() != null) ? this.getCustomer().getNama() : "") + ")");
    }
}

class OrderItem {
    private int OrderItemID;
    private Order order;
    private int produkID;
    private String produkName;
    private int price;
    private int quantity;

    public OrderItem(int OrderItemID, Order order, int produkID, String produkName, int price, int quantity) {
        this.OrderItemID = OrderItemID;
        this.order = order;
        this.produkID = produkID;
        this.produkName = produkName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getOrderItemID() {
        return OrderItemID;
    }

    public Order getOrder() {
        return order;
    }

    public int getprodukID() {
        return produkID;
    }

    public String getProdukName() {
        return produkName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printOrderItem() {
        System.out.println(this.getOrderItemID() + "(" + this.getOrderItemID() + "," + this.getOrder().getOrderID()
                + "," + this.getprodukID() + "," + this.getProdukName() + "," + this.getPrice() + ","
                + this.getQuantity() + ")");
    }
}