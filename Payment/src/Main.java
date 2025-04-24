// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Cash
        Cash cashPayment = new Cash(100.0f, 150.0f);
        System.out.println("Cash authorized: " + cashPayment.authorized());

        // Membuat objek Check
        Check checkPayment = new Check(100.0f, "John Doe", "123456");
        System.out.println("Check authorized: " + checkPayment.authorized());

        // Membuat objek Credit
        Credit creditPayment = new Credit(100.0f, "Jane Doe", "Visa", "12/25");
        System.out.println("Credit authorized: " + creditPayment.authorized());
    }
}