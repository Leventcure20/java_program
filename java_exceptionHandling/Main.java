import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String firstNum = scanner.nextLine();

        System.out.println("Enter a second number: ");
        String secondNum = scanner.nextLine();


        try {
            int firstNumber = Integer.parseInt(firstNum);
            int secondNumber = Integer.parseInt(secondNum);
            System.out.println("The result is " + (firstNumber/secondNumber));
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
            System.out.println("Error message: " + e.getMessage());
        } catch (ArithmeticException e) {  // Catch division by zero
            System.out.println("Cannot divide by zero!");
            System.out.println("Error message: " + e.getMessage());
        } catch (Exception e) {  // Catch any other exceptions
            System.out.println("Invalid operation!");
            System.out.println("Error message: " + e.getMessage());
        }
        scanner.close();
    }
}
