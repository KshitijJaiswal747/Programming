import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter directory name :");
        String DirName = sobj.nextLine();

        File dobj = new File(DirName);

        if(!dobj.exists() || !dobj.isDirectory())
        {
            System.out.println("Invalid directory.");
            return;
        }

        File Arr[] = dobj.listFiles();

        File fobj = new File("Marvellous.txt");

        if(!fobj.exists())
        {
            fobj.createNewFile();
        }

        FileWriter fwobj = new FileWriter(fobj);

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i].isFile())
            {
                FileReader frobj = new FileReader(Arr[i]);

                int iRet = 0;

                while((iRet = frobj.read()) != -1)
                {
                    fwobj.write(iRet);
                }

                frobj.close();
            }
        }

        fwobj.close();

        System.out.println("Data written successfully into Marvellous.txt.");

        sobj.close();
    }
}