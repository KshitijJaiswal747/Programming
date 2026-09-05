import java.io.*;
import java.util.*;
import java.text.*;

public class FileInfo
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
                "Error : File or directory does not exist."
            );

            scanner.close();
            return;
        }

        System.out.println(
            "File Name : " +
            file.getName()
        );

        System.out.println(
            "Absolute Path : " +
            file.getAbsolutePath()
        );

        System.out.println(
            "File Size : " +
            file.length() +
            " bytes"
        );

        System.out.println(
            "Readable : " +
            file.canRead()
        );

        System.out.println(
            "Writable : " +
            file.canWrite()
        );

        System.out.println(
            "Hidden : " +
            file.isHidden()
        );

        Date date =
            new Date(file.lastModified());

        SimpleDateFormat formatter =
            new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss"
            );

        System.out.println(
            "Last Modified : " +
            formatter.format(date)
        );

        scanner.close();
    }
}