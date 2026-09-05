import java.io.*;
import java.util.*;

public class DirectoryContents
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory : ");
        String path = scanner.nextLine();

        File directory = new File(path);

        if (!directory.exists())
        {
            System.out.println(
                "Error : Directory does not exist."
            );

            scanner.close();
            return;
        }

        if (!directory.isDirectory())
        {
            System.out.println(
                "Error : The supplied path is not a directory."
            );

            scanner.close();
            return;
        }

        File[] contents =
            directory.listFiles();

        System.out.println(
            "Contents:"
        );

        if (contents == null ||
            contents.length == 0)
        {
            System.out.println(
                "Directory is empty."
            );
        }
        else
        {
            for (File file : contents)
            {
                System.out.println(
                    file.getName()
                );
            }
        }

        scanner.close();
    }
}