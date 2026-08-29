import java.util.*;

class RailwayFare
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance: ");
        int distance = sc.nextInt();

        System.out.print("Enter class (Sleeper/3AC/2AC): ");
        String classType = sc.next();

        System.out.print("Enter booking hours before journey: ");
        int bookingHoursBefore = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(distance < 0 || bookingHoursBefore < 0 || age < 0)
        {
            System.out.println("Invalid input");
        }
        else if(!classType.equalsIgnoreCase("Sleeper") &&
                !classType.equalsIgnoreCase("3AC") &&
                !classType.equalsIgnoreCase("2AC"))
        {
            System.out.println("Invalid class type");
        }
        else
        {
            double baseFare;

            if(distance <= 100)
            {
                baseFare = distance * 2;
            }
            else if(distance <= 500)
            {
                baseFare = (100 * 2) +
                           ((distance - 100) * 1.5);
            }
            else
            {
                baseFare = (100 * 2) +
                           (400 * 1.5) +
                           ((distance - 500) * 1);
            }

            double classCharge = 0;

            if(classType.equalsIgnoreCase("Sleeper"))
            {
                classCharge = 200;
            }
            else if(classType.equalsIgnoreCase("3AC"))
            {
                classCharge = 500;
            }
            else
            {
                classCharge = 800;
            }

            double fare = baseFare + classCharge;

            System.out.println("Base Fare: ₹" + baseFare);
            System.out.println("Class Charge: ₹" + classCharge);

            if(bookingHoursBefore < 24)
            {
                double tatkal = fare * 0.30;
                fare = fare + tatkal;

                System.out.println("Tatkal Charge (30%): ₹" + tatkal);
            }
            else
            {
                System.out.println("Tatkal Charge: ₹0");
            }

            if(age >= 60)
            {
                double seniorDiscount = fare * 0.40;
                fare = fare - seniorDiscount;

                System.out.println("Senior Citizen Discount (40%): ₹"
                                   + seniorDiscount);
            }
            else
            {
                System.out.println("Senior Citizen Discount: ₹0");
            }

            System.out.println("Final Fare: ₹" + fare);
        }

        sc.close();
    }
}