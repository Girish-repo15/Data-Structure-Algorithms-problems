import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        // Traverse reversed array using reverse indexing
        for (int i = 0; i < n; i += 2) {
            sum += arr[n - 1 - i];
        }

        System.out.println(sum);
    }
}
