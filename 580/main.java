import java.util.Scanner;
public class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the profit of Company A:");
        int P = sc.nextInt();
        System.out.println("Enter the profit of Company B:");
        int Q = sc.nextInt();
        System.out.println("Enter the profit of Company C:");
        int R = sc.nextInt();
        System.out.println("Enter the profit of Company D:");
        int S = sc.nextInt();

        if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
            System.out.println("Yes");
        }
        else 
        {
            System.out.println("No");
        }

        sc.close();
    }
}
