import java.util.*;
 
public class sum_of_square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no to generate sum of square: ");
        int n = sc.nextInt();

        System.out.println((n * (n + 1) * (2 * n + 1)) / 6);
    }
}