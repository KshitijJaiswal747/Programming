import java.util.*;

class StudentResult
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects:");

        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();

        if(m1 < 0 || m1 > 100 ||
           m2 < 0 || m2 > 100 ||
           m3 < 0 || m3 > 100 ||
           m4 < 0 || m4 > 100 ||
           m5 < 0 || m5 > 100)
        {
            System.out.println("Invalid input");
        }
        else if(m1 < 35 || m2 < 35 || m3 < 35 ||
                m4 < 35 || m5 < 35)
        {
            System.out.println("Result: Fail");
        }
        else
        {
            double average = (m1 + m2 + m3 + m4 + m5) / 5.0;

            System.out.println("Average Marks: " + average);

            if(average >= 75)
            {
                System.out.println("Final Result: Distinction");
            }
            else if(average >= 60)
            {
                System.out.println("Final Result: First Class");
            }
            else if(average >= 50)
            {
                System.out.println("Final Result: Second Class");
            }
            else
            {
                System.out.println("Final Result: Pass");
            }
        }

        sc.close();
    }
}