
class truck extends vehicle {
    private int payloadCapacity;
    public truck(String make, String model, int year, int payloadCapacity){
        super(make,model,year);
        this.payloadCapacity= payloadCapacity;
    }
    @Override 
    public void drive(){
        System.out.println("driving truck.");
    }
    
}
