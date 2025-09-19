import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the topic number that is A: ");
        int A = sc.nextInt();
        System.out.println("Enter the topic number that is B: ");
        int B = sc.nextInt();
        System.out.println("Enter the topic number that is C: ");
        int C = sc.nextInt();
        System.out.println("Enter the topic number that is given: ");
        int X = sc.nextInt();

        if (X == A || X == B || X == C) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
