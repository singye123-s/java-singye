public class calci {
    public static void main(String[] args){
        int a = 10;
        int b =5;
        int sum = a + b;
        int diff = a - b;
        int mult = a * b;
        int div = a / b;
        String magic = "=====Magic======";
       
        System.out.println("addition of a&b:" + (a + b));
        System.out.println("substraction of a&b:" + (a - b));
        System.out.println("multiplication of a&b:" + (a * b));
        System.out.println("division of a&b:" + (a / b));
        System.out.println("remainder of a&b:" + (a % b));
        
        System.out.println(magic);
        System.out.println(
        "addition:" + (a + b) +
                 "susbtraction: " + (a - b)+
                 "multiplication: " + (a * b)+
                 "division: " + (a/b));


    }
}