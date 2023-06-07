/*For enhancing the book reading, school distributed story books to students as part of the Children’s day celebrations.
To increase the reading habit, the class teacher decided to exchange the books every weeks so that everyone will have a different book to read.
She wants to know how many possible exchanges are possible. 1<=n<=1000
*/
import java.util.Scanner;

public class BookExchangeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students (n): ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 1000) {
            long exchanges = factorial(n - 1);
            System.out.println("Number of possible book exchanges: " + exchanges);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 1000.");
        }
    }

    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
