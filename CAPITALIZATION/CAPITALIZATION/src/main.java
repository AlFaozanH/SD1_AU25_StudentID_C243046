import java.util.Scanner;
public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Word: ");

        String s = sc.nextLine();

        String cS = s.substring(0,1).toUpperCase() + s.substring(1);

        System.out.println(cS);

        sc.close();
    }

}
