import java.util.*;

class SupportSystem
{
    private Queue<String> requests =
        new LinkedList<>();

    public void addRequest(String request)
    {
        requests.offer(request);

        System.out.println(
            request + " added successfully"
        );
    }

    public void processRequest()
    {
        if (requests.isEmpty())
        {
            System.out.println(
                "No pending requests."
            );
            return;
        }

        String request =
            requests.poll();

        System.out.println(
            "Processing request : " +
            request
        );
    }

    public void showPendingRequests()
    {
        if (requests.isEmpty())
        {
            System.out.println(
                "No pending requests."
            );
            return;
        }

        System.out.println(
            "Pending Requests:"
        );

        for (String request : requests)
        {
            System.out.println(request);
        }
    }
}

public class SupportRequestDemo
{
    public static void main(String[] args)
    {
        SupportSystem system =
            new SupportSystem();

        system.addRequest("R101");
        system.addRequest("R102");
        system.addRequest("R103");
        system.addRequest("R104");

        System.out.println();

        system.showPendingRequests();

        System.out.println();

        system.processRequest();
        system.processRequest();

        System.out.println();

        system.showPendingRequests();
    }
}