import java.util.*;

public class FirstNonRepeating
{
    public static void main(String[] args)
    {
        Scanner scanner =
            new Scanner(System.in);

        System.out.print("Enter message : ");

        String message =
            scanner.nextLine();

        LinkedHashMap<Character, Integer> count =
            new LinkedHashMap<>();

        // Count characters
        for (char ch : message.toCharArray())
        {
            if (count.containsKey(ch))
            {
                count.put(ch, count.get(ch) + 1);
            }
            else
            {
                count.put(ch, 1);
            }
        }

        boolean found = false;

        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry :
             count.entrySet())
        {
            if (entry.getValue() == 1)
            {
                System.out.println(
                    "First non-repeating character : " +
                    entry.getKey()
                );

                found = true;
                break;
            }
        }

        if (!found)
        {
            System.out.println(
                "No non-repeating character found."
            );
        }

        scanner.close();
    }
}