class mammals{
    void mam(){
        System.out.println("Inside mammals class");

    }
    
}
class Lion extends mammals{
    void roar(){
        System.out.println("inside lion class");

    }
}
class Human extends mammals{
    void hum(){
        System.out.println("inside humn");

    }
}
class hierchalinheritance{
    public static void main(String args[]){
        Lion obj=new Lion();
        obj.roar();
        obj.mam();
        obj.hum();
    }
}