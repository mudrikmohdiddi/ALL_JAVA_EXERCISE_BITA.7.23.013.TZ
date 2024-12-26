import java.util.Scanner;
public class GassGame{
   public static void main(String[] args) {
    int secretNumber = 6;
    Scanner scanner = new Scanner(System.in);
    int number = 0;
    while(number!= secretNumber){
        System.out.print("Gass the secret number:");
        number = scanner.nextInt();
        if(number < secretNumber){
            System.out.println("The number is too low\nTry again");
        }
        else if(number > secretNumber){
            System.out.println("The number is too high\nTry again");
        }
        else{
            System.out.println("Congratulation, you win");
        }

    }
}
}