import java.util.*;

public class DependencyResolver
{
    public static void main(String[] args)
    {
        Map<String, List<String>> graph =
            new LinkedHashMap<>();

        Map<String, Integer> indegree =
            new LinkedHashMap<>();

        addDependency(
            graph,
            indegree,
            "Database",
            "Backend"
        );

        addDependency(
            graph,
            indegree,
            "Backend",
            "API"
        );

        addDependency(
            graph,
            indegree,
            "API",
            "Frontend"
        );

        List<String> order =
            topologicalSort(
                graph,
                indegree
            );

        System.out.println(
            "Valid Initialization Order:"
        );

        for (String module : order)
        {
            System.out.println(module);
        }
    }

    static void addDependency(
        Map<String, List<String>> graph,
        Map<String, Integer> indegree,
        String from,
        String to)
    {
        graph.putIfAbsent(
            from,
            new ArrayList<>()
        );

        graph.putIfAbsent(
            to,
            new ArrayList<>()
        );

        graph.get(from).add(to);

        indegree.put(
            to,
            indegree.getOrDefault(to, 0) + 1
        );

        indegree.putIfAbsent(from, 0);
    }

    static List<String> topologicalSort(
        Map<String, List<String>> graph,
        Map<String, Integer> indegree)
    {
        Queue<String> queue =
            new LinkedList<>();

        // Add modules having no dependencies
        for (Map.Entry<String, Integer> entry :
             indegree.entrySet())
        {
            if (entry.getValue() == 0)
            {
                queue.offer(
                    entry.getKey()
                );
            }
        }

        List<String> result =
            new ArrayList<>();

        while (!queue.isEmpty())
        {
            String current =
                queue.poll();

            result.add(current);

            for (String next :
                 graph.get(current))
            {
                indegree.put(
                    next,
                    indegree.get(next) - 1
                );

                if (indegree.get(next) == 0)
                {
                    queue.offer(next);
                }
            }
        }

        // Cycle detection
        if (result.size() != graph.size())
        {
            System.out.println(
                "Error : Circular dependency detected."
            );

            return new ArrayList<>();
        }

        return result;
    }
}