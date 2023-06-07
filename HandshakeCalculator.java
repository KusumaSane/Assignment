/*Before the outbreak of corona virus to the world, a meeting happened in a room in Wuhan.
A person who attended that meeting had COVID-19 and no one in the room knew about it!
So everyone started shaking hands with everyone else in the room as a gesture of respect
and after meeting unfortunately every one got infected! Given the fact that any two persons shake hand exactly once,
Can you tell the total count of handshakes happened in that meeting? n=0<n<106  */
import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of people (excluding the infected person): ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 105) {
            int handshakes = (n - 1) * (n - 2) / 2;
            System.out.println("Total count of handshakes in the meeting: " + handshakes);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 105.");
        }
    }
}
