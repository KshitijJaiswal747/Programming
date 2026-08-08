import java.io.*;
import java.util.*;

class Program4
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File already exists.");
        }
        else
        {
            if(fobj.createNewFile())
            {
                System.out.println("File created successfully.");
            }
            else
            {
                System.out.println("Unable to create file.");
            }
        }

        sobj.close();
    }
}