import java.util.*;

class CinemaBooking
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if(rows <= 0 || cols <= 0)
        {
            System.out.println("Invalid input");
            return;
        }

        int totalSeats = rows * cols;

        boolean booked[] = new boolean[totalSeats + 1];

        System.out.print("Enter number of already booked seats: ");
        int bookedCount = sc.nextInt();

        if(bookedCount < 0 || bookedCount > totalSeats)
        {
            System.out.println("Invalid input");
            return;
        }

        System.out.println("Enter booked seat numbers:");

        for(int i = 0; i < bookedCount; i++)
        {
            int seat = sc.nextInt();

            if(seat < 1 || seat > totalSeats)
            {
                System.out.println("Invalid seat number");
                return;
            }

            booked[seat] = true;
        }

        System.out.print("Enter number of seats to book: ");
        int requestedCount = sc.nextInt();

        if(requestedCount <= 0 || requestedCount > totalSeats)
        {
            System.out.println("Invalid input");
            return;
        }

        int requested[] = new int[requestedCount];

        for(int i = 0; i < requestedCount; i++)
        {
            requested[i] = sc.nextInt();

            if(requested[i] < 1 ||
               requested[i] > totalSeats ||
               booked[requested[i]])
            {
                System.out.println("Booking Failed: Seat already booked or invalid.");
                return;
            }

            // Check duplicate requested seats
            for(int j = 0; j < i; j++)
            {
                if(requested[i] == requested[j])
                {
                    System.out.println("Booking Failed: Duplicate seat requested.");
                    return;
                }
            }
        }

        double totalCost = 0;

        for(int i = 0; i < requestedCount; i++)
        {
            int seat = requested[i];

            // Find row number
            int row = ((seat - 1) / cols) + 1;

            double price;

            if(row == 1)
            {
                price = 200;
            }
            else if(row == 2)
            {
                price = 250;
            }
            else if(row == 3)
            {
                price = 300;
            }
            else
            {
                price = 350;
            }

            totalCost = totalCost + price;
        }

        double discount = 0;

        if(requestedCount >= 6)
        {
            discount = totalCost * 0.10;
        }

        double finalCost = totalCost - discount;

        // Mark seats as booked
        for(int i = 0; i < requestedCount; i++)
        {
            booked[requested[i]] = true;
        }

        int remainingSeats = 0;

        for(int i = 1; i <= totalSeats; i++)
        {
            if(!booked[i])
            {
                remainingSeats++;
            }
        }

        System.out.println("Booking Successful.");
        System.out.println("Total Cost: ₹" + totalCost);
        System.out.println("Group Discount: ₹" + discount);
        System.out.println("Final Cost: ₹" + finalCost);
        System.out.println("Remaining Seats: " + remainingSeats);

        sc.close();
    }
}