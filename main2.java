class shape {
    public double getArea() {
        return 0;
    }
}


class triangle extends shape{
    private double base;
    private double height;
    public triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return 0.5*base*height;
    }
}
class square extends shape{
    private double side;
    public square( double side){
        this.side = side;
    }

    public double getArea() {
        return 0.5 * base * height;

    }

}
class square extends shape{
    private double side;
    public square(double side) {
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }
}
class main2 {
    public static void main(String args[]){
        shape[] shape = new shape[2];
        shape[0] =new square(5);
        shape[1] = new triangle(2 , 2);
        System.out.println("area of the square: " + shape[0].getArea());
        System.out.println("area of the tringle" + shape[1].getArea());

    }
}