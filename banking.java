import java.util.Scanner;




public class banking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       try {
              
              System.out.println("What is your customer id ( letters)");
              String name = sc.nextLine();
              if ( name.equals("AOPEICG")){
                throw new Exception("Your bank subscription has ran out");
              } 
              else{
                System.out.println(" welcome to your funds");
              }
              

              
            


        } 
        
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
}
