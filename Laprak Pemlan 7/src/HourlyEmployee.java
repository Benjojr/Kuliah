import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String name, String noKTP, double wage, double hours, LocalDate tanggalLahir) {
        super(name, noKTP, tanggalLahir);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (getHours() <= 40)
            return getWage() * getHours();
        else
            return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    public String toString() {
        return String.format("Hourly employee: %s\nHourly wage: %.2f; Hours worked: %.2f", super.toString(), getWage(), getHours());
    }
}