// Heres the code
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        // Swapping without a temporary variable
        first = first + second;
        second = first - second;
        first = first - second;

        System.out.println("After swap: First number = " + first + ", Second number = " + second);
    }
}
