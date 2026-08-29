import java.util.*;

class RideFare
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        int distance = sc.nextInt();

        System.out.print("Peak Hour (Yes/No): ");
        String peak = sc.next();

        if(distance < 0)
        {
            System.out.println("Invalid input");
        }
        else if(!peak.equalsIgnoreCase("Yes") &&
                !peak.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid input");
        }
        else
        {
            double fare = 50;

            if(distance <= 10)
            {
                fare = fare + (distance * 12);
            }
            else
            {
                fare = fare + (10 * 12);
                fare = fare + ((distance - 10) * 15);
            }

            if(peak.equalsIgnoreCase("Yes"))
            {
                fare = fare + (fare * 0.20);
            }

            System.out.println("Distance: " + distance + " km");
            System.out.println("Peak Hour: " + peak);
            System.out.println("Total Fare: ₹" + fare);
        }

        sc.close();
    }
}