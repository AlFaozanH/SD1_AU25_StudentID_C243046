import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student number:");
        int N = sc.nextInt();
        System.out.println("Enter TV  Cost:");
        double X = sc.nextDouble();

        if(N<=6) {
            double minCost = X / N;
            System.out.println("minimum total cost per person: " + minCost);
        }
        else{
            System.out.println("Total Student number have to be 6 or less");
        }

        sc.close();

    }


}
