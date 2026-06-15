import java.util.Scanner;

public class rotated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int rotated = 0;

        while (number > 0) {
            int digit = number % 10;
            rotated = rotated * 10 + digit;
            number = number / 10;
        }

        System.out.println("Rotated number: " + rotated);

        input.close();
    }
}
