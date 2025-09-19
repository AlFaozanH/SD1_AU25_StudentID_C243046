import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        if (op == '+') System.out.println("Result = " + (n1 + n2));

        else if (op == '-') System.out.println("Result = " + (n1 - n2));

        else if (op == '*') System.out.println("Result = " + (n1 * n2));

        else if (op == '/') {
            if (n2 != 0) System.out.println("Result = " + (n1 / n2));
            else System.out.println("Error: Division by zero!");
        }
        else System.out.println("Invalid operator!");

        sc.close();
    }
}
