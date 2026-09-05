import java.util.*;

public class TopProducts
{
    public static void main(String[] args)
    {
        int[] products =
        {
            101, 102, 101, 103,
            101, 102, 104, 105,
            102, 102, 103
        };

        HashMap<Integer, Integer> frequency =
            new HashMap<>();

        for (int product : products)
        {
            frequency.put(
                product,
                frequency.getOrDefault(
                    product,
                    0
                ) + 1
            );
        }

        List<Map.Entry<Integer, Integer>> list =
            new ArrayList<>(
                frequency.entrySet()
            );

        list.sort(
            new Comparator<Map.Entry<Integer, Integer>>()
            {
                @Override
                public int compare(
                    Map.Entry<Integer, Integer> e1,
                    Map.Entry<Integer, Integer> e2)
                {
                    return Integer.compare(
                        e2.getValue(),
                        e1.getValue()
                    );
                }
            }
        );

        System.out.println(
            "Top 2 Products:"
        );

        for (int i = 0;
             i < 2 && i < list.size();
             i++)
        {
            Map.Entry<Integer, Integer> entry =
                list.get(i);

            System.out.println(
                entry.getKey() +
                " -> " +
                entry.getValue()
            );
        }
    }
}