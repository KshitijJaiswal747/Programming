import java.util.*;

class Matrix
{
    public static void SwapRows(int Arr[][], int iRow, int iCol)
    {
        for(int i = 0; i < iRow - 1; i = i + 2)
        {
            for(int j = 0; j < iCol; j++)
            {
                int temp = Arr[i][j];

                Arr[i][j] = Arr[i + 1][j];

                Arr[i + 1][j] = temp;
            }
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

        SwapRows(Arr, iRow, iCol);

        System.out.println("Matrix after swapping consecutive rows:");

        for(int i = 0; i < iRow; i++)
        {
            for(int j = 0; j < iCol; j++)
            {
                System.out.print(Arr[i][j] + " ");
            }

            System.out.println();
        }

        sobj.close();
    }
}