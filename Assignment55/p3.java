import java.util.*;

class SpyNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;
        int product = 1;

        while(temp > 0)
        {
            int digit = temp % 10;

            sum = sum + digit;
            product = product * digit;

            temp = temp / 10;
        }

        if(sum == product)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }

        sc.close();
    }
}