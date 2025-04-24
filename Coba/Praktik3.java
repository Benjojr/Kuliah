import java.util.Scanner;
public class Praktik3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam, upah = 0, lembur = 0, denda = 0, total;
        System.out.print("Jam kerja\t: ");
        jam = input.nextInt();
        upah = jam*5000;

        if(jam>60){
            upah = 60*5000;
            lembur = 6000*(jam-60);
            denda = 0;
        }else if(jam<50){
            upah = jam*5000;
            lembur = 0;
            denda = 1000*(50-jam);
        }
        
        total = upah+lembur-denda;

        System.out.printf("%s%d", "Upah\t\t: Rp", upah);
        System.out.printf("\n%s%d", "Lembur\t\t: Rp", lembur);
        System.out.printf("\n%s%d", "Denda\t\t: Rp", denda);
        System.out.print("\n----------------------------");
        System.out.printf("\n%s%d", "Total\t\t: Rp", total);
    }
}
