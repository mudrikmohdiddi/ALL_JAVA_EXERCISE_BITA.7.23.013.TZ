import java.util.Scanner;
public class Sport {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int w = 0;
       int l = 0;
       System.out.println("Enter won(w) or lost(l) each of 10 games \n");
       for(int i = 1;i <= 10;i++){
        System.out.printf("Game %d:",i);
        String result = sc.nextLine();
        while (true) { 
            result = result.toLowerCase();
            if(result.equals("w") || result.equals("l")){
                break;
            }
            System.out.printf("Invalid input, try again\nGame %d:",i);
            result = sc.nextLine();
        }
        if(result.equals("w")){
            w++;
        }
        else{
            l++;
        }
        }
        
        double pw = w * 100 / 10;
        double pl = l * 100 / 10;
        
        System.out.println("Number of win:"+w);
        System.out.println("Number of losses:"+l);
        System.out.println("Percentage of games won:"+pw);
        System.out.println("Percentage of games lost:"+pl);
    } 
}

