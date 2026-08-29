
import java.util.*;

class CinemaSeating
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int R = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int C = sc.nextInt();

        if(R <= 0 || C <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int seats[][] = new int[R][C];
        boolean invalid = false;

        // Accept matrix
        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                seats[i][j] = sc.nextInt();

                if(seats[i][j] != 0 && seats[i][j] != 1)
                {
                    invalid = true;
                }
            }
        }

        if(invalid)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Count booked seats
        int totalBooked = 0;

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                if(seats[i][j] == 1)
                {
                    totalBooked++;
                }
            }
        }

        // Find row with maximum bookings
        int maxBookings = 0;
        int maxRow = 0;

        for(int i = 0; i < R; i++)
        {
            int rowBookings = 0;

            for(int j = 0; j < C; j++)
            {
                if(seats[i][j] == 1)
                {
                    rowBookings++;
                }
            }

            if(rowBookings > maxBookings)
            {
                maxBookings = rowBookings;
                maxRow = i;
            }
        }

        // Check completely full row
        boolean fullRow = false;

        for(int i = 0; i < R; i++)
        {
            boolean full = true;

            for(int j = 0; j < C; j++)
            {
                if(seats[i][j] == 0)
                {
                    full = false;
                    break;
                }
            }

            if(full)
            {
                fullRow = true;
                break;
            }
        }

        // Output
        System.out.println("Total Booked Seats: " + totalBooked);
        System.out.println("Row With Maximum Bookings: Row "
                           + (maxRow + 1));

        if(fullRow)
        {
            System.out.println("Full Row Exists: Yes");
        }
        else
        {
            System.out.println("Full Row Exists: No");
        }

        // Display matrix
        System.out.println("Seat Matrix:");

        for(int i = 0; i < R; i++)
        {
            for(int j = 0; j < C; j++)
            {
                System.out.print(seats[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}