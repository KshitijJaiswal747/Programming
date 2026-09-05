import java.util.*;

public class DuplicateTransactions
{
    public static void main(String[] args)
    {
        String[] transactions =
        {
            "TX101",
            "TX102",
            "TX103",
            "TX101",
            "TX104",
            "TX102"
        };

        HashSet<String> unique =
            new HashSet<>();

        LinkedHashSet<String> duplicates =
            new LinkedHashSet<>();

        for (String transaction : transactions)
        {
            if (unique.contains(transaction))
            {
                duplicates.add(transaction);
            }
            else
            {
                unique.add(transaction);
            }
        }

        System.out.println(
            "Duplicate transactions:"
        );

        for (String transaction : duplicates)
        {
            System.out.println(transaction);
        }
    }
}