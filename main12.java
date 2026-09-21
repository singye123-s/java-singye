public class main12 {
     public static void main(String[] args){
          Shape[] shapes = new Shape[2];
          shapes[0] = new rectangle(2,4);
          shapes[1] = new circle(3);
          AreaCalculator calculator = new AreaCalculator();
          double totalArea = calculator.sumAreas(shapes);
          System.out.println("total area:" + totalArea);
     }
    }