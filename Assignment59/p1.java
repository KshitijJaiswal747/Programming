import java.util.*;

class Matrix
{
    public static void Transpose(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iCol; i++)
        {
            for(int j = 0; j < iRow; j++)
            {
                System.out.print(Arr[j][i] + " ");
            }

            System.out.println();
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

        System.out.println("Transpose of matrix:");

        Transpose(Arr, iRow, iCol);

        sobj.close();
    }
}