import java.io.*;
import java.net.*;
import java.util.*;

public class FileInfoClient
{
    private static final String SERVER =
        "localhost";

    private static final int PORT = 5004;

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
                "Connected to File Information Server."
            );

            while (true)
            {
                System.out.print(
                    "\nEnter command : "
                );

                String command =
                    scanner.nextLine();

                writer.println(command);

                String response;

                // Read multiline response
                while ((response = reader.readLine()) != null)
                {
                    System.out.println(response);

                    // Server sends blank line after response
                    // For this simple application, read one response
                    // using a different protocol is preferable.
                    break;
                }

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