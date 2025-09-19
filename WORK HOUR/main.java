import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter work hours each day:");
        int X = sc.nextInt();
        System.out.println("Enter work hours on Chill day:");
        int Y = sc.nextInt();

        int totalHours = (4 * X) + Y;

        System.out.println(totalHours);

        sc.close();
    }
}
