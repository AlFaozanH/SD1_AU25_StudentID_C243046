import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people");
        int N = sc.nextInt();
        System.out.println("Enter the minimum age to vote");
        int X = sc.nextInt();

        int count = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter Age");
            int age = sc.nextInt();
            if (age >= X) {
                count++;
            }
        }

        System.out.println(count + " eligible voters");

        sc.close();
    }
}
