import java.util.Scanner;

public class picktheday {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a day (1-7): ");
        int day = scn.nextInt();

        switch (day) {
            case 1: 
            System.out.println("Monday");
            break;
            case 2:
                System.out.println("Tuesday!");
                break;
            case 3:
                System.out.println("wWednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturdy");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
        
    }
}
