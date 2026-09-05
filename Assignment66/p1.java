import java.util.*;

public class TwoSumTransactions
{
    public static void main(String[] args)
    {
        int[] transactions =
        {
            1200, 500, 700, 300, 1500
        };

        int target = 2000;

        HashSet<Integer> visited =
            new HashSet<>();

        boolean found = false;

        for (int transaction : transactions)
        {
            int required =
                target - transaction;

            if (visited.contains(required))
            {
                System.out.println(
                    required +
                    " + " +
                    transaction +
                    " = " +
                    target
                );

                found = true;
                break;
            }

            visited.add(transaction);
        }

        if (!found)
        {
            System.out.println(
                "No two transactions match the target."
            );
        }
    }
}