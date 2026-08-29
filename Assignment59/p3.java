import java.util.*;

class Matrix
{
    public static void ReverseCol(int Arr[][], int iRow, int iCol)
    {
        for(int j = 0; j < iCol; j++)
        {
            int start = 0;
            int end = iRow - 1;

            while(start < end)
            {
                int temp = Arr[start][j];

                Arr[start][j] = Arr[end][j];

                Arr[end][j] = temp;

                start++;
                end--;
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

        ReverseCol(Arr, iRow, iCol);

        System.out.println("Matrix after reversing each column:");

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