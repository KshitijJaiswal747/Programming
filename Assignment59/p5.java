import java.util.*;

class Matrix
{
    public static boolean ChkSparse(int Arr[][], int iRow, int iCol)
    {
        int zeroCount = 0;
        int nonZeroCount = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(Arr[i][j] == 0)
                {
                    zeroCount++;
                }
                else
                {
                    nonZeroCount++;
                }
            }
        }

        if(zeroCount > nonZeroCount)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int iRow = sobj.nextInt();

        System.out.print("Enter number of columns: ");
        int iCol = sobj.nextInt();

        int Arr[][] = new int[iRow][iCol];

        System.out.println("Enter matrix:");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        boolean bRet = ChkSparse(Arr, iRow, iCol);

        if(bRet)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

        sobj.close();
    }
}