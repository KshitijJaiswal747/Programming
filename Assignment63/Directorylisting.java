import java.io.*;
import java.util.*;

public class DirectoryListing
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory : ");
        String path = scanner.nextLine();

        File directory = new File(path);

        // Check whether path exists
        if (!directory.exists())
        {
            System.out.println(
                "Error : Directory does not exist."
            );

            scanner.close();
            return;
        }

        // Check whether path is a directory
        if (!directory.isDirectory())
        {
            System.out.println(
                "Error : Supplied path is not a directory."
            );

            scanner.close();
            return;
        }

        File[] contents = directory.listFiles();

        System.out.println("\nContents:");

        if (contents == null || contents.length == 0)
        {
            System.out.println("Directory is empty.");
        }
        else
        {
            for (File file : contents)
            {
                if (file.isFile())
                {
                    System.out.println(
                        "[FILE] " +
                        file.getName() +
                        " " +
                        file.length() +
                        " bytes"
                    );
                }
                else if (file.isDirectory())
                {
                    System.out.println(
                        "[DIR] " +
                        file.getName()
                    );
                }
            }
        }

        scanner.close();
    }
}