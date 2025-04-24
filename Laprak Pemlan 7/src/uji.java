import java.time.LocalDate;
public class uji {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new SalariedEmployee("Budi", "123", 8000000, LocalDate.of(1995, 4, 8));
        employees[1] = new HourlyEmployee("Ani", "456", 20000, 45, LocalDate.of(1997, 3, 12));
        employees[2] = new CommissionEmployee("Joko", "789", 50000000, 0.1, LocalDate.of(2000, 4, 8));
        employees[3] = new BasePlusCommissionEmployee("Sari", "321", 30000000, 0.05, 3000000, LocalDate.of(1992, 5, 25));
        employees[4] = new ProductionEmployee("Dedi", "004", LocalDate.of(1999, 4, 8), 300, 10000);

        LocalDate today = LocalDate.now();

        for (Employee emp : employees) {
            double gaji = emp.earnings();
            if (emp.getTanggalLahir().getMonthValue() == today.getMonthValue()) {
                gaji += 100000;
                System.out.println("[Ulang Tahun] Bonus Rp100.000 ditambahkan!");
            }
            System.out.printf("%s\nPendapatan: Rp%.2f\n\n", emp.toString(), gaji);
        }
    }
}
