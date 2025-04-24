import java.util.Scanner; public class constAss{
    public static void main(String[] args){
    String s = "filkom";
    String val = (s=="filkom")?"Brawijaya": "null"; System.out.println(s+" "+val);
    
    Scanner input = new Scanner(System.in);
    String nama = "Ben Jason";
    String nim = "245150200111004";
    
    System.out.print("Masukkan nama: ");
    String innama = input.nextLine();
    System.out.print("Masukkan NIM: "); 
    String innim = input.nextLine();
   
    String hasil1 = (innama.equals(nama)) ? "Nama\t" + ": " + innama : "Input nama salah";;
    String hasil2 = (innim.equals(nim))?"NIM\t" + "; " +  innim : "Input NIM salah";
   
    System.out.printf("%s\n%s", hasil1, hasil2);
    }
}