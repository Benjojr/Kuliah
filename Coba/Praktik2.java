import java.util.Scanner;

public class Praktik2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double b, t, imt;
        String ket = "";

        System.out.print("Berat badan (kg)\t: ");
        b = input.nextDouble();
        System.out.print("Tinggi badan (m)\t: ");
        t = input.nextDouble();
        imt = b/(t*t);

        if(imt<=18.5){ket = "Termasuk kurus";}
        else if(imt>18.5 && imt<=25){ket = "Termasuk normal";}
        else if(imt>25 && imt<=30){ket = "Termasuk gemuk";}
        else if(imt>30){ket = "Termasuk kegemukan";}
        System.out.printf("%s\t\t\t: %.2f\t%s", "IMT", imt, ket);
    }
}