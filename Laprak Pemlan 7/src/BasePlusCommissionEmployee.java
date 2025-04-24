import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String name, String noKTP, double grossSales, double commissionRate, double baseSalary, LocalDate tanggalLahir) {
        super(name, noKTP, grossSales, commissionRate, tanggalLahir);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        return getBaseSalary() + super.earnings();
    }

    public String toString() {
        return String.format("Base-salaried commission employee: %s\nBase salary: %.2f", super.toString(), getBaseSalary());
    }
}
