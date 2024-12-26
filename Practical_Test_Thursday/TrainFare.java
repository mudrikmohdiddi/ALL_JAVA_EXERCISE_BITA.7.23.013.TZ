import java.util.Scanner;
public class TrainFare{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter zone:");
        int zone = sc.nextInt();
        sc = new Scanner(System.in);
        System.out.print("Please enter ticket type:");
        String ticket = sc.nextLine();
        ticket = ticket.toLowerCase();
        if((zone >= 1 && zone <= 4) && (ticket.equals("adult") || ticket.equals("child")) ){
           
        if(zone <= 2 && ticket.equalsIgnoreCase("adult")){
            System.out.println("The fare is 3");
        }
        else if(zone <= 2 && ticket.equalsIgnoreCase("child")){
            System.out.println("The fare is 1.50");
        }
        else if(zone == 3 && ticket.equalsIgnoreCase("adult")){
            System.out.println("The fare is 4");
        }
        else if ((zone == 3 || zone == 4) && ticket.equalsIgnoreCase("child")) {
            System.out.println("The fare is 3");
        }
        else if (zone == 4 && ticket.equalsIgnoreCase("adult")) {
            System.out.println("The fare is 6");
        }
    
    }
    else{
        System.out.println("Invalid input");
    }
    }
}