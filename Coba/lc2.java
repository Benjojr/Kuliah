import java.util.Scanner;

public class lc2 {
    static int monsterHP, dengklekHP;
    
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        monsterHP = io.nextInt();
        dengklekHP = io.nextInt();
        int bnykserangan = io.nextInt();
        io.nextLine();
        
        String[] serangan = new String[bnykserangan];
    
        for(int i = 0; i < serangan.length; i++) {
            serangan[i] = io.nextLine();
            if (serangan[i].equals("Punch")) {
                punch();
            } else if (serangan[i].equals("Kick")) {
                kick();
            } else if (serangan[i].equals("Slam")) {
                slam();
            }
        }

        
        System.out.println("HP Monster: " + monsterHP);
        System.out.println("HP Dengklek: " + dengklekHP);
        if(monsterHP>dengklekHP){
            System.out.println("Monster Menang");
        }else{
            System.out.println("Dengklek Menang");
        }
    }
    
    // Method untuk melakukan Punch
    public static void punch() {
        monsterHP -= 30;
    }
    
    // Method untuk melakukan Kick
    public static void kick() {
        monsterHP -= monsterHP * 0.1;
    }
    
    // Method untuk melakukan Slam
    public static void slam() {
        monsterHP -= 50;
        dengklekHP -= 10;
    }
}
