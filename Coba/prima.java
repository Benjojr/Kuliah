public class prima {
    public static void main(String[] args) {
        int i = 1;
        int x = 1;
        int anjay = 0;
        for (x = 2; x <= 10; x++) {
            boolean bulat = true;
            for (i = 2; i <= x / 2; i++) {
                if (x % i == 0) {
                    bulat = false;
                    break;
                }
            }
            anjay++;
            if (bulat) {
                if(anjay>5){
                    System.out.print(x + ", ");
                    System.out.println();
                }else{
                    System.out.print(x + ", ");
                }
            }
        }
    }
}