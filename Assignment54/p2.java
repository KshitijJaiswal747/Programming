import java.util.*;

class ArmstrongNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Count number of digits
        while(temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        // Calculate Armstrong sum
        while(temp > 0)
        {
            int digit = temp % 10;

            int power = 1;

            for(int i = 1; i <= count; i++)
            {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
        }

        if(sum == num)
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }

        sc.close();
    }
}