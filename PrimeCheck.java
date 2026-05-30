import java.util.Scanner;

public class PrimeCheck {

    static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n <= 3) return true;    // 2 and 3 are prime

        // eliminate multiples of 2 and 3
        if (n % 2 == 0 || n % 3 == 0) return false;

        // check from 5 to sqrt(n)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
<<<<<<< HEAD
=======

>>>>>>> 18b8efb2643f6de5f960dfd77bef0af220aa428a
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPrime(n))
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");

        sc.close();
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 18b8efb2643f6de5f960dfd77bef0af220aa428a
