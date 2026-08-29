import java.util.*;

class PalindromeNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int reverse = 0;

        while(temp > 0)
        {
            int digit = temp % 10;

            reverse = (reverse * 10) + digit;

            temp = temp / 10;
        }

        if(reverse == num)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome Number");
        }

        sc.close();
    }
}