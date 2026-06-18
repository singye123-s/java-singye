class Student {
    String name;
    int age;
    String grade;
}

public class studetntdetails {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.name = "John Smith";
        student1.age = 16;
        student1.grade = "10th Grade";

        System.out.println("Student Details");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);
        System.out.println("Grade: " + student1.grade);
    }
}
