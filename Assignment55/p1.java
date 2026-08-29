import java.util.*;

class NeonNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = square;
        int sum = 0;

        while(temp > 0)
        {
            int digit = temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        if(sum == num)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }

        sc.close();
    }
}