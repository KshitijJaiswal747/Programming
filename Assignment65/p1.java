import java.util.*;

public class BrowserHistory
{
    public static void main(String[] args)
    {
        Queue<String> history =
            new LinkedList<>();

        String[] websites =
        {
            "google.com",
            "github.com",
            "openai.com",
            "oracle.com",
            "stackoverflow.com",
            "youtube.com"
        };

        for (String website : websites)
        {
            if (history.size() == 5)
            {
                history.poll();
            }

            history.offer(website);
        }

        System.out.println("Browser History:");

        for (String website : history)
        {
            System.out.println(website);
        }
    }
}