import java.util.Scanner;
public class overload{
    int multiply( int x){
        return x * 2;
    }
    int multiply( int x, int y ){
        return x * y;

    }
    public static void main(String[] args){
      Scanner scn = new Scanner(System.in);
      System.out.println("choose a number");
      int x = scn.nextInt();
      System.out.println("choose another number");
      int y = scn.nextInt();
        System.out.println(new overload().multiply(x));

        System.out.println(new overload().multiply(x , y ));
    }
}

   

