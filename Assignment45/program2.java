import java.io.*;
import java.util.*;

class Program2
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(!fobj.exists())
        {
            System.out.println("File not found.");
            return;
        }

        FileReader frobj = new FileReader(fobj);

        int iRet = 0;

        System.out.println("Contents of file are :");

        while((iRet = frobj.read()) != -1)
        {
            System.out.print((char)iRet);
        }

        frobj.close();
        sobj.close();
    }
}