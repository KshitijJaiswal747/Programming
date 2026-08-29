import java.util.*;

class Matrix
{
    public static int AddDiagonal(int Arr[][], int iRow, int iCol)
    {
        int sum = 0;

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                if(i == j)
                {
                    sum = sum + Arr[i][j];
                }

                if(i + j == iCol - 1 && i != j)
                {
                    sum = sum + Arr[i][j];
                }
            }
        }

        return sum;
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

        int iRet = AddDiagonal(Arr, iRow, iCol);

        System.out.println("Addition of diagonal elements: " + iRet);

        sobj.close();
    }
}