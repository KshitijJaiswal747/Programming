import java.util.*;

class p2
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = sc.nextInt();

        if(balance < 0 || withdrawAmount <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(withdrawAmount % 100 != 0)
        {
            System.out.println("Transaction Failed: Withdrawal amount must be a multiple of ₹100");
        }
        else if(withdrawAmount > 25000)
        {
            System.out.println("Transaction Failed: Maximum withdrawal limit is ₹25,000");
        }
        else if(balance - withdrawAmount < 1000)
        {
            System.out.println("Transaction Failed: Minimum balance of ₹1,000 must be maintained");
        }
        else
        {
            int newBalance = balance - withdrawAmount;

            System.out.println("Transaction Successful.");
            System.out.println("Remaining Balance: ₹" + newBalance);
        }

        sc.close();
    }
}