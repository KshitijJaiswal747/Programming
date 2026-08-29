import java.util.*;

class Matrix
{
    public static void AddColumn(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            int iSum = 0;

            for(int i = 0; i < iRow; i++)
            {
                iSum = iSum + Arr[i][j];
            }

            System.out.print(iSum + " ");
        }

        System.out.println();
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

        System.out.println("Addition of each column:");

        AddColumn(Arr, iRow, iCol);

        sobj.close();
    }
}