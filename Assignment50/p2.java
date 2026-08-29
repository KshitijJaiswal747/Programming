import java.util.*;

class Scholarship
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks percentage: ");
        int marks = sc.nextInt();

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Enter family income: ");
        int income = sc.nextInt();

        if(marks < 0 || marks > 100 ||
           attendance < 0 || attendance > 100 ||
           income < 0)
        {
            System.out.println("Invalid input");
        }
        else if(marks < 80)
        {
            System.out.println("Scholarship Rejected: Marks are less than 80%");
        }
        else if(attendance < 75)
        {
            System.out.println("Scholarship Rejected: Attendance is less than 75%");
        }
        else if(income > 300000)
        {
            System.out.println("Scholarship Rejected: Family income exceeds ₹3,00,000");
        }
        else
        {
            System.out.println("Scholarship Approved");
        }

        sc.close();
    }
}