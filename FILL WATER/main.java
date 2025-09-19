import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 bottle stat:");
        int B1 = sc.nextInt();
        int B2 = sc.nextInt();
        int B3 = sc.nextInt();

        int empty = 0;
        if (B1 == 0) empty++;
        if (B2 == 0) empty++;
        if (B3 == 0) empty++;

        if (empty >= 2) {
            System.out.println("Water filling time");
        } else {
            System.out.println("Not now");
        }

        sc.close();
    }
}

