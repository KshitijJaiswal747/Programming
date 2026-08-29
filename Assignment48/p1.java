import java.util.*;

class p1
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total days book was kept: ");
        int daysKept = sc.nextInt();

        if(daysKept < 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else
        {
            int fine;

            if(daysKept <= 12)
            {
                fine = (daysKept - 7) * 5;
            }
            else
            {
                fine = (5 * 5) + ((daysKept - 12) * 10);
            }

            System.out.println("Total fine to be paid: ₹" + fine);
        }

        sc.close();
    }
}