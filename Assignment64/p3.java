import java.util.*;

public class ProductInventory
{
    static HashMap<Integer, Integer> inventory =
        new HashMap<>();

    public static void main(String[] args)
    {
        addProduct(101, 50);
        addProduct(102, 30);

        sellProduct(101, 5);

        restockProduct(102, 20);

        searchProduct(101);
    }

    // ADD operation
    static void addProduct(int productId, int quantity)
    {
        if (inventory.containsKey(productId))
        {
            inventory.put(
                productId,
                inventory.get(productId) + quantity
            );
        }
        else
        {
            inventory.put(
                productId,
                quantity
            );
        }

        System.out.println(
            "Product " +
            productId +
            " added with quantity : " +
            inventory.get(productId)
        );
    }

    // SELL operation
    static void sellProduct(
        int productId,
        int quantity)
    {
        if (!inventory.containsKey(productId))
        {
            System.out.println(
                "Product " +
                productId +
                " does not exist."
            );

            return;
        }

        int available =
            inventory.get(productId);

        if (quantity > available)
        {
            System.out.println(
                "Insufficient stock for Product " +
                productId
            );

            return;
        }

        inventory.put(
            productId,
            available - quantity
        );

        System.out.println(
            "Product " +
            productId +
            " sold : " +
            quantity
        );
    }

    // RESTOCK operation
    static void restockProduct(
        int productId,
        int quantity)
    {
        if (!inventory.containsKey(productId))
        {
            System.out.println(
                "Product " +
                productId +
                " does not exist."
            );

            return;
        }

        inventory.put(
            productId,
            inventory.get(productId) + quantity
        );

        System.out.println(
            "Product " +
            productId +
            " restocked : " +
            quantity
        );
    }

    // SEARCH operation
    static void searchProduct(int productId)
    {
        if (inventory.containsKey(productId))
        {
            System.out.println(
                "Product " +
                productId +
                " available quantity : " +
                inventory.get(productId)
            );
        }
        else
        {
            System.out.println(
                "Product " +
                productId +
                " does not exist."
            );
        }
    }
}