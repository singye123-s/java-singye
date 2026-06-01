import java.util.Scanner;
public class whileproject {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("choose a num");
        int num = scn.nextInt();
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum = sum+i;
            i++;
            
        }
        System.out.println(sum);

    }
}
