import java.io.*;
import java.net.*;

public class FileExistsServer
{
    private static final int PORT = 5003;

    public static void main(String[] args)
    {
        System.out.println(
            "File Exists Server Started..."
        );

        System.out.println(
            "Waiting for clients on port " + PORT
        );

        try (ServerSocket serverSocket =
                 new ServerSocket(PORT))
        {
            while (true)
            {
                Socket clientSocket =
                    serverSocket.accept();

                System.out.println(
                    "Client connected : " +
                    clientSocket.getInetAddress()
                );

                FileExistsHandler handler =
                    new FileExistsHandler(
                        clientSocket
                    );

                Thread thread =
                    new Thread(handler);

                thread.start();
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Server Error : " +
                e.getMessage()
            );
        }
    }
}

class FileExistsHandler implements Runnable
{
    private Socket socket;

    public FileExistsHandler(Socket socket)
    {
        this.socket = socket;
    }

    @Override
    public void run()
    {
        try
        {
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

            String command;

            while ((command = reader.readLine()) != null)
            {
                System.out.println(
                    "Received : " + command
                );

                if (command.trim()
                    .equalsIgnoreCase("QUIT"))
                {
                    writer.println(
                        "Disconnected from server."
                    );

                    break;
                }

                String response =
                    processCommand(command);

                writer.println(response);
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Client Error : " +
                e.getMessage()
            );
        }
        finally
        {
            try
            {
                socket.close();
            }
            catch (IOException e)
            {
                System.out.println(
                    "Error closing socket."
                );
            }

            System.out.println(
                "Client disconnected."
            );
        }
    }

    private String processCommand(String command)
    {
        String[] parts =
            command.trim().split("\\s+", 2);

        if (parts.length != 2)
        {
            return "Invalid command format.";
        }

        String operation =
            parts[0].toUpperCase();

        String fileName =
            parts[1];

        if (!operation.equals("EXISTS"))
        {
            return "Invalid command.";
        }

        return checkFile(fileName);
    }

    private String checkFile(String fileName)
    {
        File file =
            new File(fileName);

        if (file.exists())
        {
            return fileName +
                   " exists on server";
        }
        else
        {
            return fileName +
                   " does not exist";
        }
    }
}