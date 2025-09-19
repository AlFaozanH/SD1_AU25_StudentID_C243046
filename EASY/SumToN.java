import java.util.Scanner;
public class SumToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = (n * (n + 1)) / 2; // formula
        System.out.println("Sum from 1 to " + n + " = " + sum);

        sc.close();
    }
}
