import java.io.*;
import java.net.*;
import java.util.*;

public class FileExistsClient
{
    private static final String SERVER =
        "localhost";

    private static final int PORT = 5003;

    public static void main(String[] args)
    {
        try
        {
            Socket socket =
                new Socket(SERVER, PORT);

            BufferedReader reader =
                new BufferedReader(
                    new InputStreamReader(
                        socket.getInputStream()
                    )
                );

            PrintWriter writer =
                new PrintWriter(
                    socket.getOutputStream(),
                    true
                );

            Scanner scanner =
                new Scanner(System.in);

            System.out.println(
                "Connected to File Server."
            );

            while (true)
            {
                System.out.print(
                    "\nEnter command : "
                );

                String command =
                    scanner.nextLine();

                writer.println(command);

                String response =
                    reader.readLine();

                System.out.println(
                    "Server : " +
                    response
                );

                if (command.trim()
                    .equalsIgnoreCase("QUIT"))
                {
                    break;
                }
            }

            scanner.close();
            socket.close();
        }
        catch (IOException e)
        {
            System.out.println(
                "Client Error : " +
                e.getMessage()
            );
        }
    }
}