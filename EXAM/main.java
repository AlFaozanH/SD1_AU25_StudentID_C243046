import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sections number:");
        int X = sc.nextInt();
        System.out.println("Enter students number:");
        int Y = sc.nextInt();
        System.out.println("Enter passed students number:");
        int Z = sc.nextInt();

        int totalStudents = X * Y;

        if (2 * Z > totalStudents) {
            System.out.println("Yes,Passed Students was strictly greater than 50%");
        } else {
            System.out.println("No, Passed Students wasn't strictly greater than 50%");
        }

        sc.close();
    }
}
