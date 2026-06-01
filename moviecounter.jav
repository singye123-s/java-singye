import java.util.Scanner;

public class MovieRating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rating count: ");
        int count = input.nextInt();

        if (count >= 100) {
            System.out.println("Movie Rating: Excellent");
        } else if (count >= 50) {
            System.out.println("Movie Rating: Good");
        } else {
            System.out.println("Movie Rating: Average");
        }
    }
}