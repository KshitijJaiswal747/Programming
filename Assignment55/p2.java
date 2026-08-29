import java.util.*;

class AutomorphicNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = num * num;
        int temp = num;
        int divisor = 1;

        while(temp > 0)
        {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if(square % divisor == num)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
            System.out.println("Not Automorphic Number");
        }

        sc.close();
    }
}