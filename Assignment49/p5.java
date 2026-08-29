import java.util.*;

class IncomeTax
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter annual income: ");
        int income = sc.nextInt();

        if(income < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double tax = 0;

            if(income <= 250000)
            {
                tax = 0;
            }
            else if(income <= 500000)
            {
                tax = (income - 250000) * 0.05;
            }
            else if(income <= 1000000)
            {
                tax = (250000 * 0.05) +
                      ((income - 500000) * 0.20);
            }
            else
            {
                tax = (250000 * 0.05) +
                      (500000 * 0.20) +
                      ((income - 1000000) * 0.30);
            }

            System.out.println("Annual Income: ₹" + income);
            System.out.println("Total Tax Payable: ₹" + tax);
        }

        sc.close();
    }
}