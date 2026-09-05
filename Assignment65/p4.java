import java.util.*;

public class WordFrequency
{
    public static void main(String[] args)
    {
        String text =
            "java python java c java python cpp";

        String[] words =
            text.split("\\s+");

        LinkedHashMap<String, Integer> frequency =
            new LinkedHashMap<>();

        for (String word : words)
        {
            frequency.put(
                word,
                frequency.getOrDefault(
                    word,
                    0
                ) + 1
            );
        }

        System.out.println(
            "Word Frequencies:"
        );

        String mostFrequent = "";
        int maximumFrequency = 0;

        for (Map.Entry<String, Integer> entry :
             frequency.entrySet())
        {
            System.out.println(
                entry.getKey() +
                " -> " +
                entry.getValue()
            );

            if (entry.getValue() >
                maximumFrequency)
            {
                maximumFrequency =
                    entry.getValue();

                mostFrequent =
                    entry.getKey();
            }
        }

        System.out.println();

        System.out.println(
            "Most frequent word : " +
            mostFrequent
        );

        System.out.println(
            "Frequency : " +
            maximumFrequency
        );
    }
}