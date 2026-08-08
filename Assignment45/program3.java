import java.io.*;
import java.util.*;

class Program3
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter file name :");
        String FileName = sobj.nextLine();

        System.out.println("Enter data to write :");
        String Data = sobj.nextLine();

        FileWriter fwobj = new FileWriter(FileName, true);

        fwobj.write(Data);
        fwobj.write("\n");

        fwobj.close();

        System.out.println("Data written successfully at the end of file.");

        sobj.close();
    }
}