import java.io.*;
import java.util.*;

class Program1
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name :");
        String DirName = sobj.nextLine();

        File dobj = new File(DirName);

        if(!dobj.exists())
        {
            System.out.println("Directory not found.");
            return;
        }

        if(!dobj.isDirectory())
        {
            System.out.println("It is not a directory.");
            return;
        }

        File Arr[] = dobj.listFiles();

        System.out.println("Regular files are :");

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile())
            {
                System.out.println(Arr[i].getName());
            }
        }

        sobj.close();
    }
}