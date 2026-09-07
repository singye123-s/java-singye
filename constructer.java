public class constructer {
    String model;
    int year;

    
    public constructer(String carModel, int carYear) {
        model = carModel; 
        year = carYear;
    }

    public void displayDetails() {
        System.out.println("Car: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
      
        constructer myCar = new constructer("Tesla Model 3", 2026);
        
        myCar.displayDetails(); 
    }
}
