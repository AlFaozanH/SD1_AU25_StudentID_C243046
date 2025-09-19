import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the starting time: ");
        int X = sc.nextInt();

        if(X <= 7){
            System.out.println("All assignments will be complete on time");
        }else {
            System.out.println("No all assignments will not be complete on time");
        }

        sc.close();
    }
}
