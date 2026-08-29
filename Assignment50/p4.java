import java.util.*;

class ShoppingBudget
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter budget amount: ");
        int budget = sc.nextInt();

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        if(budget < 0 || n < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int balance = budget;
            int count = 0;
            boolean invalid = false;

            for(int i = 1; i <= n; i++)
            {
                System.out.print("Enter price of item " + i + ": ");
                int price = sc.nextInt();

                if(price <= 0)
                {
                    invalid = true;
                    break;
                }

                if(price <= balance)
                {
                    balance = balance - price;
                    count++;
                }
                else
                {
                    break;
                }
            }

            if(invalid)
            {
                System.out.println("Invalid input");
            }
            else
            {
                System.out.println("Items Purchased: " + count);
                System.out.println("Remaining Balance: ₹" + balance);
            }
        }

        sc.close();
    }
}