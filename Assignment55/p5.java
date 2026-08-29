import java.util.*;

class DisariumNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        // Count digits
        while(temp > 0)
        {
            count++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        // Calculate sum of digits raised to positions
        while(temp > 0)
        {
            int digit = temp % 10;

            int power = 1;

            for(int i = 1; i <= count; i++)
            {
                power = power * digit;
            }

            sum = sum + power;

            count--;
            temp = temp / 10;
        }

        if(sum == num)
        {
            System.out.println("Disarium Number");
        }
        else
        {
            System.out.println("Not Disarium Number");
        }

        sc.close();
    }
}