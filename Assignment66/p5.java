import java.util.*;

public class SocialNetwork
{
    public static void main(String[] args)
    {
        Map<String, List<String>> network =
            new HashMap<>();

        addFriend(
            network,
            "Amit",
            "Rahul"
        );

        addFriend(
            network,
            "Amit",
            "Pooja"
        );

        addFriend(
            network,
            "Rahul",
            "Neha"
        );

        addFriend(
            network,
            "Pooja",
            "Kiran"
        );

        addFriend(
            network,
            "Neha",
            "Riya"
        );

        addFriend(
            network,
            "Kiran",
            "Riya"
        );

        findShortestPath(
            network,
            "Amit",
            "Riya"
        );
    }

    static void addFriend(
        Map<String, List<String>> network,
        String person,
        String friend)
    {
        network.putIfAbsent(
            person,
            new ArrayList<>()
        );

        network.putIfAbsent(
            friend,
            new ArrayList<>()
        );

        network.get(person)
               .add(friend);
    }

    static void findShortestPath(
        Map<String, List<String>> network,
        String start,
        String target)
    {
        Queue<String> queue =
            new LinkedList<>();

        Set<String> visited =
            new HashSet<>();

        Map<String, String> parent =
            new HashMap<>();

        queue.offer(start);
        visited.add(start);

        boolean found = false;

        while (!queue.isEmpty())
        {
            String current =
                queue.poll();

            if (current.equals(target))
            {
                found = true;
                break;
            }

            for (String friend :
                 network.getOrDefault(
                     current,
                     new ArrayList<>()
                 ))
            {
                if (!visited.contains(friend))
                {
                    visited.add(friend);

                    parent.put(
                        friend,
                        current
                    );

                    queue.offer(friend);
                }
            }
        }

        if (!found)
        {
            System.out.println(
                "No connection found."
            );

            return;
        }

        // Reconstruct path
        List<String> path =
            new ArrayList<>();

        String current = target;

        while (current != null)
        {
            path.add(current);

            current =
                parent.get(current);
        }

        Collections.reverse(path);

        System.out.println(
            "Shortest Path:"
        );

        for (int i = 0;
             i < path.size();
             i++)
        {
            System.out.print(
                path.get(i)
            );

            if (i < path.size() - 1)
            {
                System.out.print(
                    " -> "
                );
            }
        }

        System.out.println();

        System.out.println(
            "Number of connections : " +
            (path.size() - 1)
        );
    }
}