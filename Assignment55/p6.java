import java.util.*;

class TrimorphicNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int cube = num * num * num;
        int temp = num;
        int divisor = 1;

        while(temp > 0)
        {
            divisor = divisor * 10;
            temp = temp / 10;
        }

        if(cube % divisor == num)
        {
            System.out.println("Trimorphic Number");
        }
        else
        {
            System.out.println("Not Trimorphic Number");
        }

        sc.close();
    }
}