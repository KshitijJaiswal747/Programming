import java.util.*;

class PersonalLoan
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter monthly income: ");
        int income = sc.nextInt();

        System.out.print("Enter credit score: ");
        int score = sc.nextInt();

        System.out.print("Existing unpaid loan (Yes/No): ");
        String loan = sc.next();

        if(age < 0 || income < 0 || score < 0)
        {
            System.out.println("Invalid input");
        }
        else if(!loan.equalsIgnoreCase("Yes") &&
                !loan.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid input");
        }
        else if(age < 21 || age > 60)
        {
            System.out.println("Loan Rejected: Age must be between 21 and 60");
        }
        else if(income < 25000)
        {
            System.out.println("Loan Rejected: Monthly income must be at least ₹25,000");
        }
        else if(score < 700)
        {
            System.out.println("Loan Rejected: Credit score must be at least 700");
        }
        else if(loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sc.close();
    }
}