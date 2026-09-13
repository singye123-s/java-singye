public class main9 {
    public static void main(String[] args){
        dog d = new dog("buddy", 3, "labrador");
        cat c = new cat("kitty", 2, true);
        System.out.println(d.getName()+ d.getAge() + d.getBreed());
        System.out.println(c.getName() + c.getAge() + c.getisIndoor());
        d.makeSound();
        c.makeSound();


    }

}
