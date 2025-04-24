import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Anda dibebaskan dalam penggunaan metode dan/atau fungsi library dengan syarat TIDAK menambah import selain yang sudah diberikan di atas.
        Scanner io = new Scanner(System.in);
        String kal = io.nextLine();
        
        kal = kal.toUpperCase().replaceAll("[^A-Z]", "");
      	String[] hurufada = kal.split("");
      	
      	String alfa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      	String[] alpabet = alfa.split("");
      	
      	boolean[] ditemukan = new boolean[26];
      	int jmlhunik = 0;
      	
      	for(int i=0;i<hurufada.length;i++){
      	    for(int j=0;j<alpabet.length;j++){
      	        if (hurufada[i].equals(alpabet[j])&&ditemukan[j]==false){
      	            ditemukan[j]=true;
      	            jmlhunik++;
      	        }
      	    }
      	}
      	
      	if(jmlhunik==26){
      	    if(hurufada.length==26){
      	        System.out.println("Input merupakan pangram sempurna! :D");
      	    }else{
      	        System.out.println("Input hanya pangram biasa saja :)");
      	    }
      	}else{
      	    System.out.print("Input bukan merupakan pangram karena tidak memiliki huruf ");
      	    boolean x=true;
      	    for(int i = 0;i<26;i++){
      	        if(ditemukan[i]==false){
                    if(i==26-1){System.out.print(alpabet[i]);}
      	            else{System.out.print(alpabet[i]+", ");}
      	            x=false;
      	        }
      	    }
      	    System.out.println(" :(");
      	}
    }
}