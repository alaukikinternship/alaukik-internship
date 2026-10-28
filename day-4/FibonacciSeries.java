
import java.util.*;

public class FibonacciSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        int i = 0;
        int j = 1;

        for (int k = 0; k < n; k++) {
            System.out.print(i + " ");

            int tmp = i + j;
            i = j;
            j = tmp;
        }

        sc.close();
    }
}