import java.io.*;
import java.util.*;

public class FileAnalysis
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists())
        {
            System.out.println(
                "Error : File does not exist."
            );

            scanner.close();
            return;
        }

        if (!file.isFile())
        {
            System.out.println(
                "Error : Supplied path is not a file."
            );

            scanner.close();
            return;
        }

        int characters = 0;
        int words = 0;
        int lines = 0;
        int uppercase = 0;
        int lowercase = 0;
        int digits = 0;
        int spaces = 0;

        try
        {
            FileInputStream fis =
                new FileInputStream(file);

            StringBuilder content =
                new StringBuilder();

            int data;

            while ((data = fis.read()) != -1)
            {
                char ch = (char)data;

                content.append(ch);

                characters++;

                if (Character.isUpperCase(ch))
                {
                    uppercase++;
                }

                if (Character.isLowerCase(ch))
                {
                    lowercase++;
                }

                if (Character.isDigit(ch))
                {
                    digits++;
                }

                if (ch == ' ')
                {
                    spaces++;
                }

                if (ch == '\n')
                {
                    lines++;
                }
            }

            fis.close();

            String text = content.toString();

            // Handle last line if file doesn't end with \n
            if (text.length() > 0)
            {
                if (text.charAt(text.length() - 1) != '\n')
                {
                    lines++;
                }
            }

            // Count words
            String trimmed = text.trim();

            if (!trimmed.isEmpty())
            {
                String[] wordArray =
                    trimmed.split("\\s+");

                words = wordArray.length;
            }

            System.out.println("\nFile : " + fileName);
            System.out.println(
                "Characters : " + characters
            );
            System.out.println(
                "Words : " + words
            );
            System.out.println(
                "Lines : " + lines
            );
            System.out.println(
                "Uppercase : " + uppercase
            );
            System.out.println(
                "Lowercase : " + lowercase
            );
            System.out.println(
                "Digits : " + digits
            );
            System.out.println(
                "Spaces : " + spaces
            );
        }
        catch (IOException e)
        {
            System.out.println(
                "Error while reading file : " +
                e.getMessage()
            );
        }

        scanner.close();
    }
}