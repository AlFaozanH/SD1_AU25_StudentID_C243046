import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        if (A + B > 2 * C) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}