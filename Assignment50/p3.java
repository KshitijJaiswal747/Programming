import java.util.*;

class CourierCharge
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parcel weight in kg: ");
        int weight = sc.nextInt();

        if(weight <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int charge;

            if(weight <= 1)
            {
                charge = 50;
            }
            else if(weight <= 5)
            {
                charge = 50 + ((weight - 1) * 20);
            }
            else
            {
                charge = 150 + ((weight - 5) * 30);
            }

            System.out.println("Parcel Weight: " + weight + " kg");
            System.out.println("Courier Charge: ₹" + charge);
        }

        sc.close();
    }
}