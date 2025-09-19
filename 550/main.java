import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many kg of pulp received:");
        int N = sc.nextInt();
        int notebooks = N * 10;

        System.out.println(notebooks + " " +"Notebooks");1

        sc.close();
    }
}
