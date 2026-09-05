import java.io.*;
import java.util.*;

public class SearchFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter directory : ");
        String directoryPath = scanner.nextLine();

        System.out.print("Enter file to search : ");
        String fileName = scanner.nextLine();

        File directory = new File(directoryPath);

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
                "Error : Supplied path is not a directory."
            );

            scanner.close();
            return;
        }

        File[] files = directory.listFiles();

        boolean found = false;

        if (files != null)
        {
            for (File file : files)
            {
                if (file.isFile() &&
                    file.getName().equals(fileName))
                {
                    System.out.println("\nFile found");

                    System.out.println(
                        "Name : " +
                        file.getName()
                    );

                    System.out.println(
                        "Size : " +
                        file.length() +
                        " bytes"
                    );

                    System.out.println(
                        "Path : " +
                        file.getAbsolutePath()
                    );

                    found = true;
                    break;
                }
            }
        }

        if (!found)
        {
            System.out.println(
                fileName + " not found"
            );
        }

        scanner.close();
    }
}