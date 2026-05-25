import java.util.Scanner;
public class leapyer {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("enter a year");
        int year = scn.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0))
         {
         System.out.println("Even yer");
        }
        else {
        System.out.println("not even year");
        }

    }
}
