import java.util.*;

class HotelBill
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days stayed: ");
        int days = sc.nextInt();

        if(days < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double bill = days * 3000;

            if(days > 7)
            {
                bill = bill - (bill * 0.05);
            }

            System.out.println("Total Stay Duration: " + days + " days");
            System.out.println("Final Bill Amount: ₹" + bill);
        }

        sc.close();
    }
}