public class array2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i - j == 3 || i + j == 15 || j - i == 8 || i + j == 4) {
                    System.out.print("A "); 
                } 
                else if (i == 1 && j == 4 || i == 1 && j == 8 || i == 2 && j == 5 || i == 2 && j == 7 || i == 3 && j == 6){
                    System.out.print("A ");
                }
                
                else {
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
    }
}
