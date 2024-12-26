import java.util.Scanner;
public class PinLatin {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter English word:");
       String English = scanner.nextLine();
       int c = -1;
       String latin = "";
       String con = "";
       String vowel = "aeiou";
       for(int n = 0;n < English.length();n++){
        for(int m = 0;m < 5;m++){
            String eng = English.toLowerCase();
            if(eng.charAt(n) == vowel.charAt(m)){
                c=n;
                break;
            }
            
 
        }
        if(c >=0){
            break;
        }
       }
       if(c>0){
        for(int p = c;p < English.length();p++){
            latin += English.charAt(p);
            }
        for(int h = 0;h < c;h++){
            con += English.charAt(h);
        }
            latin += con + "ay";
       }
       else{
        latin = English + "hay";
       }
       System.out.println("The English:"+English+"--> The Latin is:"+latin);
   } 
}
