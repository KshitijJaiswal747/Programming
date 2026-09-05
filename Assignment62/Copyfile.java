import java.io.*;
import java.util.*;

public class CopyFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file : ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter destination file : ");
        String destinationFile = scanner.nextLine();

        try
        {
            FileInputStream fis =
                new FileInputStream(sourceFile);

            FileOutputStream fos =
                new FileOutputStream(destinationFile);

            byte[] buffer = new byte[1024];

            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1)
            {
                fos.write(buffer, 0, bytesRead);
            }

            fis.close();
            fos.close();

            System.out.println(
                "File copied successfully"
            );
        }
        catch (FileNotFoundException e)
        {
            System.out.println(
                "Error : Source file does not exist."
            );
        }
        catch (IOException e)
        {
            System.out.println(
                "Error while copying file : " +
                e.getMessage()
            );
        }

        scanner.close();
    }
}