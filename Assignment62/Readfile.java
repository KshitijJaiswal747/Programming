import java.io.*;
import java.util.*;

public class ReadFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = scanner.nextLine();

        try
        {
            FileInputStream fis =
                new FileInputStream(fileName);

            System.out.println(
                "File contents:"
            );

            int data;

            while ((data = fis.read()) != -1)
            {
                System.out.print(
                    (char)data
                );
            }

            fis.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println(
                "Error : File does not exist."
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