import java.io.*;
import java.util.*;

class program1
{
    public static void main(String A []) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            System.out.println("File Opened Successfully.");   
        }
        else
        {
            System.out.println("File not found.");
        }
        sobj.close();

    }
}