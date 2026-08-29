import java.util.*;

class FitnessApp
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        int goal = 10000;
        int count = 0;
        int maximum = 0;

        System.out.println("Enter steps for 7 days:");

        boolean invalid = false;

        for(int i = 1; i <= 7; i++)
        {
            int steps = sc.nextInt();

            if(steps < 0)
            {
                invalid = true;
                break;
            }

            if(steps >= goal)
            {
                count++;
            }

            if(steps > maximum)
            {
                maximum = steps;
            }
        }

        if(invalid)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Goal Achieved Days: " + count);
            System.out.println("Maximum Steps in Week: " + maximum);
        }

        sc.close();
    }
}