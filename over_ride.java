class animal{
     public String color = "white";
      animal(){
        System.out.println(color);
      }

     

}
class dog extends animal{
     dog(){
        super();
    } 

}
public class over_ride{
    public static void main(String[] args){
        dog dog1 = new dog();

    }

}