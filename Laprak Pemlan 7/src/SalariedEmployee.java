import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double weeklySalary; // gaji/minggu

    public SalariedEmployee(String name, String noKTP, double weeklySalary, LocalDate tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public double earnings() {
        return getWeeklySalary();
    }

    public String toString() {
        return String.format("Salaried employee: %s\nWeekly salary: %.2f", super.toString(), getWeeklySalary());
    }
}