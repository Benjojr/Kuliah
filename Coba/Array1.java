import java.util.Scanner;
public class Array1{
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int i = io.nextInt();
        int[] a = new int[i];
        int x = 0;
        
        while(x<i){
            a[x]=x+1;
            System.out.print(a[x]+" ");
            x++;
        }
    }
}