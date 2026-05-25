import java.util.Scanner;
public class hellouser {
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("enter a string: ");
    String str = scn.nextLine();
    System.out.println("The string is"+str);


    System.out.print("enter an integer:");
    int num = scn.nextInt();
    System.out.println("this is you number"+num);

    System.out.println("enter your float");
    float flo = scn.nextFloat();
    System.out.println("this is your float"+flo);

    scn.close();
  }
    
}
