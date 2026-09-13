class car extends vehicle {
    private int numDoors;
    public car(String make, String model, int year, int numDoors){
        super(make,model,year);
        this.numDoors = numDoors;

    }
    @Override public void drive(){
        System.out.println("driving car...");
    }
    public int getnumDoors(){
        return numDoors;
    }
}
