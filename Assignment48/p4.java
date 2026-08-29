import java.util.*;

class ElectricityBill
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        if(units < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int bill;

            if(units <= 100)
            {
                bill = units * 5;
            }
            else if(units <= 200)
            {
                bill = (100 * 5) + ((units - 100) * 7);
            }
            else
            {
                bill = (100 * 5) +
                       (100 * 7) +
                       ((units - 200) * 10);
            }

            System.out.println("Total Units Consumed: " + units);
            System.out.println("Total Electricity Bill: ₹" + bill);
        }

        sc.close();
    }
}