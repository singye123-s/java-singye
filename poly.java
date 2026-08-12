class Hillstations{
    void location(){
        System.out.println("location is: ");
    }
    void famousfor(){
        System.out.println("famous for: ");
    }
}

class manali extends Hillstations{
    void location(){
        System.out.println("manali is in himachl Pradesh: ");
    }
    void famousfor(){
        System.out.println("manali is famous for adventure spots");
    }

}
class ladakh extends Hillstations{
 void location(){
    System.out.println("Ladakh is located in ladakh");

 }
 void famousfor(){
    System.out.println("ladakh is famous for its mountains");
 }
}
public class poly{
    public static void main(String[] args){
        manali m = new manali();
        ladakh l = new ladakh();
        m.famousfor();
        m.location();
        l.famousfor();
        l.location();
    }
}
