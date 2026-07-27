import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scn.nextDouble();

        System.out.print("(+, -, *, /): ");
        char operator = scn.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scn.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    scn.close();
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator!");
                scn.close();
                return;
        }

        System.out.println("Result: " + result);

        scn.close();
    }
}
