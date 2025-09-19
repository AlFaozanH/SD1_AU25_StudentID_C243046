import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What Alice wants the be the temperature:");
        int A = sc.nextInt();
        System.out.println("What Bob wants the be the temperature:");
        int B = sc.nextInt();
        System.out.println("What Charlie wants the be the temperature:");
        int C = sc.nextInt();

        int minReq = Math.max(A, C);

        if (minReq <= B) {
            System.out.println("Yes, they all can agree on some temperature");
        } else {
            System.out.println("No, they all can't agree on a temperature");
        }

        sc.close();
    }
}
