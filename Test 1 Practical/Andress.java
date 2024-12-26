import java.util.Scanner;
import java.util.Arrays;
public class Andress {
   public static void main(String[] args) {
       String[] nameArray = new String[3];
       double[] minuteArray = new double[3];
       for(int i = 1;i<=3;i++){
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter name of runner "+i+":");
       String name = sc.nextLine();
       System.out.print("Enter minute of "+name+" finish:");
       double minute = sc.nextDouble();
       nameArray[i-1]=name + " finish at "+minute;
       minuteArray[i-1]=minute;

       }
       Arrays.sort(minuteArray);
       String[] result =new String[3];
       for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            String mn = minuteArray[i] + "";
            if(nameArray[j].endsWith(mn)){
                result[i]=nameArray[j];
            }
        }
       }
       for(int i=1;i<=3;i++){
        System.out.println(i+". "+result[i]);
       }
   } 
}
