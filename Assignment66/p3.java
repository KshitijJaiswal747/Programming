import java.util.*;

public class DepartmentGrouping
{
    public static void main(String[] args)
    {
        String[][] employees =
        {
            {"Amit", "IT"},
            {"Rahul", "HR"},
            {"Pooja", "IT"},
            {"Neha", "Finance"},
            {"Kiran", "HR"},
            {"Riya", "IT"}
        };

        LinkedHashMap<String, ArrayList<String>>
            departments =
            new LinkedHashMap<>();

        for (String[] employee : employees)
        {
            String name =
                employee[0];

            String department =
                employee[1];

            if (!departments.containsKey(department))
            {
                departments.put(
                    department,
                    new ArrayList<>()
                );
            }

            departments.get(department)
                       .add(name);
        }

        for (Map.Entry<String, ArrayList<String>> entry :
             departments.entrySet())
        {
            System.out.println(
                entry.getKey() + ":"
            );

            for (String name : entry.getValue())
            {
                System.out.println(name);
            }
        }
    }
}