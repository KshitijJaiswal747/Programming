import java.io.*;
import java.net.*;

public class StringServer
{
    private static final int PORT = 5001;

    public static void main(String[] args)
    {
        System.out.println("String Server Started...");
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

                StringClientHandler handler =
                    new StringClientHandler(clientSocket);

                Thread thread = new Thread(handler);
                thread.start();
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

class StringClientHandler implements Runnable
{
    private Socket socket;

    public StringClientHandler(Socket socket)
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

                String result =
                    processCommand(command);

                writer.println(result);
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Client Error : " + e.getMessage()
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

        String str =
            parts[1];

        switch (operation)
        {
            case "LENGTH":
                return "Length is : " +
                       findLength(str);

            case "UPPER":
                return str.toUpperCase();

            case "LOWER":
                return str.toLowerCase();

            case "REVERSE":
                return reverseString(str);

            case "PALINDROME":
                return checkPalindrome(str);

            case "VOWELS":
                return "Number of vowels : " +
                       countVowels(str);

            default:
                return "Invalid command.";
        }
    }

    private int findLength(String str)
    {
        return str.length();
    }

    private String reverseString(String str)
    {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }

    private String checkPalindrome(String str)
    {
        String reverse = reverseString(str);

        if (str.equalsIgnoreCase(reverse))
        {
            return str + " is a Palindrome";
        }
        else
        {
            return str + " is not a Palindrome";
        }
    }

    private int countVowels(String str)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++)
        {
            char ch =
                Character.toLowerCase(
                    str.charAt(i)
                );

            if (ch == 'a' ||
                ch == 'e' ||
                ch == 'i' ||
                ch == 'o' ||
                ch == 'u')
            {
                count++;
            }
        }

        return count;
    }
}