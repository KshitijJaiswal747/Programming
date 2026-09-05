import java.io.*;
import java.net.*;
import java.time.*;
import java.time.format.*;
import java.net.InetAddress;

public class InfoServer
{
    private static final int PORT = 5002;

    public static void main(String[] args)
    {
        System.out.println(
            "Server Information Server Started..."
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

                InfoClientHandler handler =
                    new InfoClientHandler(clientSocket);

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

class InfoClientHandler implements Runnable
{
    private Socket socket;

    public InfoClientHandler(Socket socket)
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

                String response =
                    processCommand(command);

                writer.println(response);

                if (command.trim()
                    .equalsIgnoreCase("QUIT"))
                {
                    break;
                }
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
        switch (command.trim().toUpperCase())
        {
            case "DATE":
                return getDate();

            case "TIME":
                return getTime();

            case "SERVERNAME":
                return getServerName();

            case "HELP":
                return getHelp();

            case "QUIT":
                return "Disconnected from server.";

            default:
                return "Invalid command. Type HELP for commands.";
        }
    }

    private String getDate()
    {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(
                "dd-MM-yyyy"
            );

        return LocalDate.now()
            .format(formatter);
    }

    private String getTime()
    {
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern(
                "HH:mm:ss"
            );

        return LocalTime.now()
            .format(formatter);
    }

    private String getServerName()
    {
        try
        {
            return InetAddress
                .getLocalHost()
                .getHostName();
        }
        catch (UnknownHostException e)
        {
            return "Unable to determine server name.";
        }
    }

    private String getHelp()
    {
        return "Available Commands:\n" +
               "DATE\n" +
               "TIME\n" +
               "SERVERNAME\n" +
               "HELP\n" +
               "QUIT";
    }
}