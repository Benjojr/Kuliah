import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        Manusia manusia1 = new Manusia("Udin", "111", true, true);
        Manusia manusia2 = new Manusia("Markonah", "112", false, true);
        Manusia manusia3 = new Manusia("Agus", "113", true, false);
        System.out.println(manusia1);
        System.out.println();
        System.out.println(manusia2);
        System.out.println();
        System.out.println(manusia3);
        System.out.println();

        MahasiswaFILKOM filkom1 = new MahasiswaFILKOM("Ben", "121", false, false, "2451502001110004", 2.5);
        MahasiswaFILKOM filkom2 = new MahasiswaFILKOM("Ben", "122", false, false, "2451502001110004", 3.2);
        MahasiswaFILKOM filkom3 = new MahasiswaFILKOM("Ben", "123", false, false, "2451502001110004", 3.7);
        System.out.println(filkom1);
        System.out.println();
        System.out.println(filkom2);
        System.out.println();
        System.out.println(filkom3);
        System.out.println();

        Manusia pekerja1 = new Pekerja("Ucok", "131", true, true, 1000.0, LocalDate.of (2023, 3, 27), 2);
        Manusia pekerja2 = new Pekerja("Ucok 2", "132", true, true, 1000.0, LocalDate.of (2016, 3, 27),0);
        Manusia pekerja3 = new Pekerja("Ucok 3", "133", true, true, 1000.0, LocalDate.of (2005, 3, 2), 10)   ;
        System.out.println(pekerja1);
        System.out.println();
        System.out.println(pekerja2);
        System.out.println();
        System.out.println(pekerja3);
        System.out.println();

        Manusia manager1 = new Manager("Asep", "231", true, true, 7500.0, LocalDate.of(2010, 3, 27), 0, "HRD");
        System.out.println(manager1);
    }
}

