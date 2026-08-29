import java.util.*;

class StudentPerformance
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int N = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int M = sc.nextInt();

        if(N <= 0 || M <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int marks[][] = new int[N][M];
        boolean invalid = false;

        // Accept matrix
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                marks[i][j] = sc.nextInt();

                if(marks[i][j] < 0 || marks[i][j] > 100)
                {
                    invalid = true;
                }
            }
        }

        if(invalid)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Calculate student totals
        int totals[] = new int[N];

        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                totals[i] = totals[i] + marks[i][j];
            }
        }

        // Find topper
        int topper = 0;

        for(int i = 1; i < N; i++)
        {
            if(totals[i] > totals[topper])
            {
                topper = i;
            }
        }

        // Output student totals
        System.out.println("Student Totals:");

        for(int i = 0; i < N; i++)
        {
            System.out.println("Student " + (i + 1) + ": " + totals[i]);
        }

        System.out.println("Topper: Student " + (topper + 1));

        // Subject averages
        System.out.println("Subject Averages:");

        for(int j = 0; j < M; j++)
        {
            int sum = 0;

            for(int i = 0; i < N; i++)
            {
                sum = sum + marks[i][j];
            }

            double average = (double)sum / N;

            System.out.printf("Subject %d: %.2f%n",
                              (j + 1), average);
        }

        // Find failed students
        System.out.println("Students Failed:");

        for(int i = 0; i < N; i++)
        {
            boolean failed = false;

            for(int j = 0; j < M; j++)
            {
                if(marks[i][j] < 35)
                {
                    failed = true;
                    break;
                }
            }

            if(failed)
            {
                System.out.println("Student " + (i + 1));
            }
        }

        sc.close();
    }
}