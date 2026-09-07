public class Student extends person {
    private String major;
    public Student(String name, int age, String major){
        super(name, age);
        this.major = major;

    }
    public String getMajor(){
        return major;

    }
    

}

