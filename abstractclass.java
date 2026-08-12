abstract class Objects{
    abstract void showShape();
    public void shape(){
        System.out.println("Im abstract class");
    }

      
    
}
class Sphere extends Objects{
    void showShape(){
        System.out.println("object type is sphere");
    }
}
class cuboid extends Objects{
    void showShape(){
        System.out.println("object type is cuboid");
    }
}
class prism extends Objects{
    void showShape(){
        System.out.println("object type is prism");
    }
}

public class abstractclass{
    public static void main(String[] args){
       Objects obj = new Sphere();
       obj.shape();
       obj.showShape();
       obj = new cuboid();
       obj.shape();
       obj.showShape();
       obj = new prism();
       obj.shape();
       obj.showShape();


    }
}