import java.time.LocalDate;;

public class Main {
    public static void main(String[] args) {

        //Membuat objek Nasabah
        Nasabah nasabah = new Nasabah("John Doe", "N001", "081234567890");
        System.out.println(nasabah);

        //Membuat objek Rekening
        Rekening rekening = new Rekening("R001", 1000000, "Tabungan");
        nasabah.addRekening(rekening);
        System.out.println(nasabah);

        Rekening rekening2 = new Rekening("R002", 500000, "Tabungan");
        nasabah.addRekening(rekening2);
        System.out.println(nasabah);

        //Deposit dan Withdraw
        rekening.deposit(500000);
        rekening.withdraw(200000);

        Pembayaran pembayaran = new Pembayaran("P001", 300000, LocalDate.of(2025, 4, 10), rekening2);
        pembayaran.prosesPembayaran();
        System.out.println(pembayaran);
    }
}
