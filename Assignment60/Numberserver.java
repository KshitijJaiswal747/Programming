import java.io.*;
import java.net.*;

public class NumberServer
{
    private static final int PORT = 6000;

    public static void main(String[] args)
    {
        System.out.println(
            "Number Operation Server started..."
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

                NumberClientHandler handler =
                    new NumberClientHandler(
                        clientSocket
                    );

                Thread t =
                    new Thread(handler);

                t.start();
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

class NumberClientHandler implements Runnable
{
    private Socket socket;

    public NumberClientHandler(Socket socket)
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
            command.trim().split("\\s+");

        if (parts.length != 2)
        {
            return "Invalid command format.";
        }

        String operation =
            parts[0].toUpperCase();

        int number;

        try
        {
            number =
                Integer.parseInt(parts[1]);
        }
        catch (NumberFormatException e)
        {
            return "Invalid number.";
        }

        switch (operation)
        {
            case "EVEN":
                return checkEven(number);

            case "ODD":
                return checkOdd(number);

            case "PRIME":
                return checkPrime(number);

            case "PERFECT":
                return checkPerfect(number);

            case "FACTORIAL":
                return findFactorial(number);

            case "REVERSE":
                return reverseNumber(number);

            default:
                return "Invalid command.";
        }
    }

    // Check Even
    private String checkEven(int number)
    {
        if (number % 2 == 0)
        {
            return number +
                   " is an Even Number";
        }
        else
        {
            return number +
                   " is not an Even Number";
        }
    }

    // Check Odd
    private String checkOdd(int number)
    {
        if (number % 2 != 0)
        {
            return number +
                   " is an Odd Number";
        }
        else
        {
            return number +
                   " is not an Odd Number";
        }
    }

    // Check Prime
    private String checkPrime(int number)
    {
        if (number <= 1)
        {
            return number +
                   " is not a Prime Number";
        }

        for (int i = 2;
             i <= Math.sqrt(number);
             i++)
        {
            if (number % i == 0)
            {
                return number +
                       " is not a Prime Number";
            }
        }

        return number +
               " is a Prime Number";
    }

    // Check Perfect Number
    private String checkPerfect(int number)
    {
        if (number <= 0)
        {
            return number +
                   " is not a Perfect Number";
        }

        int sum = 0;

        for (int i = 1;
             i <= number / 2;
             i++)
        {
            if (number % i == 0)
            {
                sum = sum + i;
            }
        }

        if (sum == number)
        {
            return number +
                   " is a Perfect Number";
        }
        else
        {
            return number +
                   " is not a Perfect Number";
        }
    }

    // Find Factorial
    private String findFactorial(int number)
    {
        if (number < 0)
        {
            return "Factorial is not defined for negative numbers.";
        }

        long factorial = 1;

        for (int i = 1;
             i <= number;
             i++)
        {
            factorial =
                factorial * i;
        }

        return "Factorial is : " +
               factorial;
    }

    // Reverse Number
    private String reverseNumber(int number)
    {
        int original = number;
        int temp = Math.abs(number);

        int reverse = 0;

        while (temp != 0)
        {
            int digit =
                temp % 10;

            reverse =
                reverse * 10 +
                digit;

            temp =
                temp / 10;
        }

        if (original < 0)
        {
            reverse =
                -reverse;
        }

        return "Reverse number is : " +
               reverse;
    }
}