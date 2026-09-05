import java.util.*;

public class LongestConsecutive
{
    public static void main(String[] args)
    {
        int[] ids =
        {
            100, 4, 200, 1, 3, 2, 5
        };

        HashSet<Integer> numbers =
            new HashSet<>();

        for (int id : ids)
        {
            numbers.add(id);
        }

        int bestStart = 0;
        int bestLength = 0;

        for (int number : numbers)
        {
            // Check if this is the beginning
            // of a consecutive sequence
            if (!numbers.contains(number - 1))
            {
                int current = number;
                int length = 1;

                while (numbers.contains(current + 1))
                {
                    current++;
                    length++;
                }

                if (length > bestLength)
                {
                    bestLength = length;
                    bestStart = number;
                }
            }
        }

        System.out.println(
            "Longest consecutive sequence:"
        );

        for (int i = 0;
             i < bestLength;
             i++)
        {
            System.out.print(
                (bestStart + i) + " "
            );
        }

        System.out.println();

        System.out.println(
            "Length : " +
            bestLength
        );
    }
}