import java.util.Scanner;
public class GradeCalculator {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);    
   System.out.print("Enter number of grades:");
   int number = scanner.nextInt();
   float total = 0f;
   float grade = 0f;
   float average = 0f;
   for(int m = 1;m <= number;m++){
    System.out.print("Enter grades number "+m+":");
    grade = scanner.nextFloat();
    total += grade;
   }
   average = total/number;
   System.out.println("The average of grade is "+average);
}
}
