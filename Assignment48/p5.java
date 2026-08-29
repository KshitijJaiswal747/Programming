import java.util.*;

class Ecommerce
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        int amount = sc.nextInt();

        System.out.print("Enter membership type (Premium/Regular): ");
        String membership = sc.next();

        if(amount <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(!membership.equalsIgnoreCase("Premium") &&
                !membership.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid input");
        }
        else
        {
            double discount = 0;

            // Main discount
            if(amount > 5000)
            {
                discount = amount * 0.20;
            }
            else if(amount > 2000)
            {
                discount = amount * 0.10;
            }

            double discountedAmount = amount - discount;

            // Premium extra discount
            if(membership.equalsIgnoreCase("Premium"))
            {
                double premiumDiscount = discountedAmount * 0.05;
                discount = discount + premiumDiscount;
                discountedAmount = discountedAmount - premiumDiscount;
            }

            System.out.println("Original Amount: ₹" + amount);
            System.out.println("Total Discount: ₹" + discount);
            System.out.println("Final Payable Amount: ₹" + discountedAmount);
        }

        sc.close();
    }
}