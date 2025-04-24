import java.util.*;
public class blajar {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan harga: Rp");
        int price = io.nextInt();
        System.out.println("Harga awal: Rp"+price);
        if(price>500000)price-=(price/10);
        else if(price>=200000)price-=(price/20);

        System.out.println("Harga total: Rp"+price+",-");
    }
}
