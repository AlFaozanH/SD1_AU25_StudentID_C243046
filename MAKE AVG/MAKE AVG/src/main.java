import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int C = sc.nextInt();

        int B1 = (A+C)/2;

        Double B2 = (double) (A+C)/2;

        if (B1-B2 == 0) {

            System.out.println("YES, B exists B is the average of A and C and B =" + " " +B1);

        } else {

            System.out.println("B is not an integer");
        }


    }

}
