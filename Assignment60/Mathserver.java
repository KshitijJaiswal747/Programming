import java.io.*;
import java.net.*;

public class MathServer
{
    private static final int PORT = 5000;

    public static void main(String[] args)
    {
        System.out.println("Math Server started...");
        System.out.println("Waiting for clients on port " + PORT);

        try (ServerSocket serverSocket = new ServerSocket(PORT))
        {
            while (true)
            {
                Socket clientSocket = serverSocket.accept();

                System.out.println(
                    "Client connected : " +
                    clientSocket.getInetAddress()
                );

                ClientHandler handler =
                    new ClientHandler(clientSocket);

                Thread t = new Thread(handler);
                t.start();
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Server Error : " + e.getMessage()
            );
        }
    }
}

class ClientHandler implements Runnable
{
    private Socket socket;

    public ClientHandler(Socket socket)
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

                if (command.trim().equalsIgnoreCase("QUIT"))
                {
                    writer.println(
                        "Disconnected from server."
                    );
                    break;
                }

                String result = processCommand(command);

                writer.println(result);
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Client communication error : " +
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

            System.out.println("Client disconnected.");
        }
    }

    private String processCommand(String command)
    {
        String[] parts =
            command.trim().split("\\s+");

        if (parts.length != 3)
        {
            return "Invalid command format.";
        }

        String operation =
            parts[0].toUpperCase();

        double no1;
        double no2;

        try
        {
            no1 = Double.parseDouble(parts[1]);
            no2 = Double.parseDouble(parts[2]);
        }
        catch (NumberFormatException e)
        {
            return "Invalid number.";
        }

        switch (operation)
        {
            case "ADD":
                return "Result is : " + (no1 + no2);

            case "SUB":
                return "Result is : " + (no1 - no2);

            case "MULT":
                return "Result is : " + (no1 * no2);

            case "DIV":
                if (no2 == 0)
                {
                    return "Error : Division by zero is not allowed.";
                }

                return "Result is : " + (no1 / no2);

            case "MOD":
                if (no2 == 0)
                {
                    return "Error : Modulo by zero is not allowed.";
                }

                return "Result is : " + (no1 % no2);

            case "MAX":
                return "Maximum number is : " +
                       Math.max(no1, no2);

            case "MIN":
                return "Minimum number is : " +
                       Math.min(no1, no2);

            default:
                return "Invalid command.";
        }
    }
}