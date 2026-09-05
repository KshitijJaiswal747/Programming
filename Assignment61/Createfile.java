import java.io.*;
import java.util.*;

public class CreateFile
{
    public static void main(String[] args)
    {
        Scanner scanner =
            new Scanner(System.in);

        System.out.print(
            "Enter file name : "
        );

        String fileName =
            scanner.nextLine();

        File file =
            new File(fileName);

        System.out.println(
            "\nFile Name : " +
            file.getName()
        );

        System.out.println(
            "Absolute Path : " +
            file.getAbsolutePath()
        );

        try
        {
            if (file.exists())
            {
                System.out.println(
                    "Status : File already exists"
                );
            }
            else
            {
                boolean created =
                    file.createNewFile();

                if (created)
                {
                    System.out.println(
                        "Status : " +
                        file.getName() +
                        " created successfully"
                    );
                }
                else
                {
                    System.out.println(
                        "Status : File creation failed"
                    );
                }
            }
        }
        catch (IOException e)
        {
            System.out.println(
                "Error : " +
                e.getMessage()
            );
        }

        scanner.close();
    }
}