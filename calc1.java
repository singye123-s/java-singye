import java.util.Scanner;
public class calc1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        try {
              
              System.out.println("What is your name");
              String name = sc.nextLine();
              if ( name.equals("Ryan")){
                throw new Exception("Student is black listed");
              } 
              else{
                System.out.println("student is allowed");
              }
              

              
            


        } 
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
