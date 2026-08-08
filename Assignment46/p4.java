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

        if(!fobj.exists())
        {
            System.out.println("File not found.");
            return;
        }

        FileInputStream fiobj = new FileInputStream(fobj);

        int iRet = 0;
        long Checksum = 0;

        while((iRet = fiobj.read()) != -1)
        {
            Checksum = Checksum + iRet;
        }

        fiobj.close();

        System.out.println("Checksum of file is : " + Checksum);

        sobj.close();
    }
}