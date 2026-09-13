class cat extends animal{

    private boolean isIndoor;
    public cat(String name, int age, boolean isIndoor){
        super(name, age);
        this.isIndoor = isIndoor;

    }
   public boolean getisIndoor(){return isIndoor;}
    @Override 
   public void makeSound(){
    System.out.println("the cat meows");
   }
}
