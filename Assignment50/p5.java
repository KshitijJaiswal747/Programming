import java.util.*;

class BatteryStatus
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if(battery < 0 || battery > 100)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Battery Percentage: " + battery + "%");

            if(battery <= 5)
            {
                System.out.println("Critical");
            }
            else if(battery <= 15)
            {
                System.out.println("Low");
            }
            else
            {
                System.out.println("Normal");
            }
        }

        sc.close();
    }
}