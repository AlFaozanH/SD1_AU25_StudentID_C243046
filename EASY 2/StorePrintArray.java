import java.util.Scanner;
public class StorePrintArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Stored numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
