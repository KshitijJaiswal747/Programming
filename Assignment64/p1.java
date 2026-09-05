import java.util.*;

public class EmployeeEntryCount
{
    public static void main(String[] args)
    {
        int[] employeeIds =
        {
            101, 102, 103, 101,
            104, 102, 101, 105
        };

        LinkedHashMap<Integer, Integer> count =
            new LinkedHashMap<>();

        for (int id : employeeIds)
        {
            if (count.containsKey(id))
            {
                count.put(id, count.get(id) + 1);
            }
            else
            {
                count.put(id, 1);
            }
        }

        System.out.println("Employee Entry Count:");

        for (Map.Entry<Integer, Integer> entry :
             count.entrySet())
        {
            System.out.println(
                entry.getKey() +
                " -> " +
                entry.getValue()
            );
        }
    }
}