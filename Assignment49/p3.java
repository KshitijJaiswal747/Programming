import java.util.*;

class WarehouseStock
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current stock: ");
        int stock = sc.nextInt();

        System.out.print("Enter requested quantity: ");
        int quantity = sc.nextInt();

        if(stock < 0)
        {
            System.out.println("Invalid input");
        }
        else if(quantity <= 0)
        {
            System.out.println("Invalid input");
        }
        else if(quantity > stock)
        {
            System.out.println("Order Failed: Insufficient Stock.");
        }
        else
        {
            stock = stock - quantity;

            System.out.println("Order Processed Successfully.");
            System.out.println("Remaining Stock: " + stock);

            if(stock < 5)
            {
                System.out.println("Low Stock Alert!");
            }
        }

        sc.close();
    }
}