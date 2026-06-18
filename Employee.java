
public class Employee {
    int empno;
    static int count = 0;
    String name;
    float sal;
    Employee(){
        count++;
        System.out.println("*********");
        empno = 101;
        name ="aashish";
        sal = 5000f;
    }
    void displayDetails(){
        System.out.println(empno + "|" + name + "|" + sal);

    }
}
class Main{

    public static void main(String[] args){
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        System.out.println(Employee.count);
    }
}
