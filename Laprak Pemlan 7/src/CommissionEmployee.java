import java.time.LocalDate;

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String name, String noKTP, double grossSales, double commissionRate, LocalDate tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("Commission employee: %s\nGross sales: %.2f; Commission rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
}