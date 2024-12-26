import java.util.Scanner;
public class ExpandingWord {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter word:");
    String word = scanner.next();
    String answer = "";
    for(int n = 0;n < word.length();n++){
        for(int s = 0;s <=n;s++){
            answer += word.charAt(n);
        }
    }
    System.out.println("Expanding word of "+word + "is "+answer); 
}
}
