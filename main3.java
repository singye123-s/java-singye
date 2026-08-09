
class cube {
    private double side;

    public cube(double side) {
        this.side = side;
    }

    public double getside() {
        return side;
    }

    public double getvolume() {
        return side * side * side;
    }
}

class main3 {
    public static void main(String args[]) {

        cube c = new cube(5);

        System.out.println("side: " + c.getside());
        System.out.println("volume of cube: " + c.getvolume());
    }
}


