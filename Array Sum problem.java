import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();        // size of array
        long sum = 0;                // use long to avoid overflow for large numbers

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();     // add each element
        }

        System.out.println(sum);      // print the sum
    }
}
