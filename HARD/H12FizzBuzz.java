import java.util.Scanner;
public class H12FizzBuzz
{
    public static void main(String[] args) 
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) 
        {
            if (i % 3 == 0 && i % 5 == 0) 
            {
                System.out.println("FIZZ BUSS");
            } 
            else if (i % 3 == 0) 
            {
                System.out.println("FIZZ");
            } 
            else if (i % 5 == 0) 
            {
                System.out.println("BUSS");
            } 
            else 
            {
                System.out.println(i);
            }
        }
    }
}
