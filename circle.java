public class circle {
   
   private double radius;
   public circle(double radius){
    this.radius=radius;
   }
    public double getRadius(){
      return radius;
   }
   public double area(){
     return  Math.PI*radius*radius;
   }
   public double circumference(){
     return 2*Math.PI*radius;
   }
}
