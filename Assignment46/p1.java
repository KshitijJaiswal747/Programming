import java.io.*;
import java.util.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter source file name :");
        String Source = sobj.nextLine();

        System.out.println("Enter destination file name :");
        String Destination = sobj.nextLine();

        File fobj1 = new File(Source);
        File fobj2 = new File(Destination);

        if(!fobj1.exists())
        {
            System.out.println("Source file not found.");
            return;
        }

        FileInputStream fiobj = new FileInputStream(fobj1);
        FileOutputStream foobj = new FileOutputStream(fobj2);

        int iRet = 0;

        while((iRet = fiobj.read()) != -1)
        {
            foobj.write(iRet);
        }

        fiobj.close();
        foobj.close();

        System.out.println("Data copied successfully.");

        sobj.close();
    }
}