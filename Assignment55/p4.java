import java.util.*;

class SunnyNumber
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int value = num + 1;
        boolean flag = false;

        for(int i = 1; i * i <= value; i++)
        {
            if(i * i == value)
            {
                flag = true;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Sunny Number");
        }
        else
        {
            System.out.println("Not Sunny Number");
        }

        sc.close();
    }
}