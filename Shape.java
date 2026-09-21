interface Shape{
     double getArea();
} 

class rectangle implements Shape{
       private double width;
       private double height;
       public rectangle(double width, double height){
        this.width = width;
        this.height = height;
       }
       @Override 
       public double getArea(){
        return width *height;
       }
}
class circle implements Shape{
     private double radius;
     public circle(double radius){
          this.radius = radius;
     }
     @Override 
     public double getArea(){
          return Math.PI*radius*radius;
     }
}
class AreaCalculator {
     public double sumAreas(Shape[] shapes){
          double totalArea = 0;
          
          for (Shape shape : shapes){
               totalArea += shape.getArea();

          }
          return totalArea;
     }
}


