import java.util.*;

class TrafficFine
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Helmet worn (Yes/No): ");
        String helmet = sc.next();

        System.out.print("License available (Yes/No): ");
        String license = sc.next();

        System.out.print("Overspeeding (Yes/No): ");
        String speed = sc.next();

        if((!helmet.equalsIgnoreCase("Yes") &&
            !helmet.equalsIgnoreCase("No")) ||
           (!license.equalsIgnoreCase("Yes") &&
            !license.equalsIgnoreCase("No")) ||
           (!speed.equalsIgnoreCase("Yes") &&
            !speed.equalsIgnoreCase("No")))
        {
            System.out.println("Invalid input");
        }
        else
        {
            int fine = 0;

            if(helmet.equalsIgnoreCase("No"))
            {
                fine = fine + 500;
            }

            if(license.equalsIgnoreCase("No"))
            {
                fine = fine + 1000;
            }

            if(speed.equalsIgnoreCase("Yes"))
            {
                fine = fine + 1500;
            }

            System.out.println("Total Fine Amount: ₹" + fine);
        }

        sc.close();
    }
}