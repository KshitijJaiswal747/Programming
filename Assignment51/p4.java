import java.util.*;

class WaterBill
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water units: ");
        int units = sc.nextInt();

        System.out.print("Enter weeks late: ");
        int weeksLate = sc.nextInt();

        if(units < 0 || weeksLate < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double bill;

            if(units <= 100)
            {
                bill = units * 5;
            }
            else if(units <= 200)
            {
                bill = (100 * 5) +
                       ((units - 100) * 8);
            }
            else
            {
                bill = (100 * 5) +
                       (100 * 8) +
                       ((units - 200) * 12);
            }

            // Fixed meter charge
            bill = bill + 50;

            double penaltyRate = weeksLate * 0.02;

            if(penaltyRate > 0.10)
            {
                penaltyRate = 0.10;
            }

            double lateFee = bill * penaltyRate;

            double billAmount = bill + lateFee;

            System.out.println("Water Units: " + units);
            System.out.println("Meter Charge: ₹50");
            System.out.println("Late Fee: ₹" + lateFee);
            System.out.println("Bill Amount: ₹" + billAmount);
        }

        sc.close();
    }
}