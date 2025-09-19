import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of children:");
        int N = sc.nextInt();
        System.out.println("Enter the number of candies already have:");
        int X = sc.nextInt();

        int needed = (N - X);
        if(needed > 0 ) {

            int packets = (needed + 3)/4;
            System.out.println("packets needed "+packets);
        }
        else {
            System.out.println("No packets needed");
        }
        sc.close();
    }
}
