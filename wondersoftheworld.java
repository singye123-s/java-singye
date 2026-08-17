class sevenwonders{
    void location(){
        System.out.println("location is: ");

    }
    void name(){
        System.out.println("name is: ");
    }
}
class eiffeltower extends sevenwonders{
       void location(){
        System.out.println("location is: Paris, France ");

    }
    void name(){
        System.out.println("name is: Eiffel Tower ");
    }
}
class wallofchina extends sevenwonders{
    void location(){
        System.out.println("location is: China");

    }
    void name(){
        System.out.println("name is: Great Wall of China");
        
    }
}
class tajmahal extends sevenwonders{
    void location(){
        System.out.println("location is: india");

    }
    void name(){
        System.out.println("name is: taj mahal");
        
    }
}
class petra extends sevenwonders{
    void location(){
        System.out.println("location is: jordan");

    }
    void name(){
        System.out.println("name is: petra");
        
    }
}
class colleseum extends sevenwonders{
    void location(){
        System.out.println("location is: italy");

    }
    void name(){
        System.out.println("name is: colleseum");
        
    }
}
class chichenitza extends sevenwonders{
    void location(){
        System.out.println("location is: mexico");

    }
    void name(){
        System.out.println("name is: chichen itza");
        
    }
}
class machupichu extends sevenwonders{
    void location(){
        System.out.println("location is: peru");

    }
    void name(){
        System.out.println("name is: machu pichu");
        
    }
}
class christredeemer extends sevenwonders{
    void location(){
        System.out.println("location is: brazil");

    }
    void name(){
        System.out.println("name is: christ the redeemer");
        
    }
}
public class wondersoftheworld{
    public static void main(String[] args){
        wallofchina c = new wallofchina();
        eiffeltower e = new eiffeltower();
        tajmahal t = new tajmahal();
        petra p = new petra();
        colleseum i = new colleseum();
        chichenitza z = new chichenitza();
        machupichu m = new machupichu();
        christredeemer x = new christredeemer();
        m.name();
        m.location();
        c.name();
        c.location();
        e.name();
        e.location();
        i.name();
        i.location();
        z.name();
        z.location();
        x.name();
        x.location();
        z.name();
        z.location();
        

    }
}
