import java.util.*;

class HarshadNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if(num % sum == 0)
        {
            System.out.println("Harshad Number");
        }
        else
        {
            System.out.println("Not Harshad Number");
        }

        sc.close();
    }
}