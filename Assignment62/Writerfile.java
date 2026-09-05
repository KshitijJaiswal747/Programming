import java.io.*;
import java.util.*;

public class WriteFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = scanner.nextLine();

        System.out.print("Enter data : ");
        String data = scanner.nextLine();

        try
        {
            FileOutputStream fos =
                new FileOutputStream(fileName);

            byte[] bytes =
                data.getBytes();

            fos.write(bytes);

            fos.close();

            System.out.println(
                "Data written successfully"
            );
        }
        catch (IOException e)
        {
            System.out.println(
                "Error : " + e.getMessage()
            );
        }

        scanner.close();
    }
}