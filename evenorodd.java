import java.util.Scanner;
public class evenorodd {
 
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.print("choose a number if it is even or odd");
       int num = scn.nextInt();
       if(num%2 == 0){
        System.out.println("even");
       }else{
        System.out.println("odd");
        
       }

    }

    
}
