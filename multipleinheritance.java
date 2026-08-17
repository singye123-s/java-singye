interface father{
    void father_features();
}
interface mother{
    void mother_features();
}
class boy implements father, mother{
       public void father_features(){
        System.out.println("Face shape");
     }
        public void mother_features(){
        System.out.println("eyes");
      }


}



public class multipleinheritance {
    public static void main(String[] args){

    
    boy b = new boy();
    b.father_features();
    b.mother_features();
    }
}
