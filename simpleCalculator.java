import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = sc.nextDouble();
        System.out.print("Enter the type of operation you want to perform (+, -, *, /, %): ");
        String operation = sc.next();
        double result = performOperation(firstNumber, secondNumber, operation);
        System.out.println("Your answer is: " + result);
    }
    public static int performOperation(double firstNumber, double secondNumber, String operation)
    {
        int result = 0;
        if (operation.equals("+")) {
            result = firstNumber + secondNumber;
        }
        else if (operation.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operation.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operation.equals("%")) {
            result = firstNumber % secondNumber;
        }
        else if (operation.equals("/")) {
            result = firstNumber / secondNumber;
        }
        else {
            System.out.println("Invalid operation");
        }
        return result;
    }
}
