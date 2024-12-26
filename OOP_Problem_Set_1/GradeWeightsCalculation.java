import java.util.Scanner;
public class GradeWeightsCalculation{
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);    
   System.out.print("Enter number of grades:");
   int number = scanner.nextInt();
   float weights = 0f;
   float grade = 0f;
   float average = 0f;
   for(int m = 1;m <= number;m++){
    System.out.print("Enter grades number "+m+":");
    grade = scanner.nextFloat();
    System.out.print("Enter weights of grades "+grade+":");
    weights = scanner.nextFloat();
    average += grade * weights;
   }
   System.out.println("The average of grade with the weights  is "+average);
}
}
