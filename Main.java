import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator myCalculator = new Calculator();
        boolean continueCalculating = true;
        while (continueCalculating){
            System.out.println("Enter first number:");
            double a = sc.nextDouble();
            System.out.println("Enter second number:");
            double b = sc.nextDouble();
            System.out.println("Choose the operation: +, -, *, /, %");
            String operation = sc.next();

            double result = 0;
            boolean valid = true;

            switch (operation) {
                case "+":
                    result = myCalculator.add(a, b);
                    break;
                case "-":
                    result = myCalculator.subtract(a, b);
                    break;
                case "*":
                    result = myCalculator.multiply(a, b);
                    break;
                case "/":
                    result = myCalculator.divide(a, b);
                    break;
                case "%":
                    result = myCalculator.modulo(a, b);
                    break;
                default:
                    System.out.println("Invalid operation. Please try again.");
                    valid = false;
                    continue; // Skip to the next iteration
                }

            if (valid) {
                System.out.println("Result: " + result);
            }

            System.out.println("Do you want to perform another calculation? (yes/no)");
            sc.nextLine(); 
            String answer = sc.nextLine();
            if (!answer.equalsIgnoreCase("yes")) {
                continueCalculating = false;
                System.out.println("Thank you for using calculator!");
            }
        }

        sc.close();
    }
}
