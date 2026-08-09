
import java.util.Scanner;

public class employeesalary {

    public static Employee getemployeedetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter id:");
        int id = scanner.nextInt();

        System.out.println("enter name:");
        String name = scanner.next();

        System.out.println("enter salary:");
        double salary = scanner.nextDouble();

        Employee employee = new Employee();

        employee.setemployeeid(id);
        employee.setemployeename(name);
        employee.setsalary(salary);

        return employee;
    }

    public static int getpfpercentage() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter pf percentage:");
        int pf = scanner.nextInt();

        return pf;
    }

    public static void main(String[] args) {

        Employee employee = getemployeedetails();

        int pf = getpfpercentage();

        employee.calculatenetsalary(pf);

        System.out.println("id: " + employee.getemployeeid());
        System.out.println("name: " + employee.getemployeename());
        System.out.println("salary: " + employee.getsalary());
        System.out.println("net salary: " + employee.getnetsalary());
    }
}

class Employee {

    private int id;
    private String name;
    private double salary;
    private double netsalary;

    public int getemployeeid() {
        return id;
    }

    public void setemployeeid(int id) {
        this.id = id;
    }

    public String getemployeename() {
        return name;
    }

    public void setemployeename(String name) {
        this.name = name;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public double getnetsalary() {
        return netsalary;
    }

    public void calculatenetsalary(int pfpercentage) {
        double pfamount = (salary * pfpercentage) / 100;
        netsalary = salary - pfamount;
    }
}

