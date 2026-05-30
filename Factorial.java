import java.util.*;

public class Factorial {
    public static int fact(int n) {
        int ans = 1;

        for (int i = 2; i <= n; i++) {
            ans *= i;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Factorial = " + fact(n));

        sc.close();
    }
}