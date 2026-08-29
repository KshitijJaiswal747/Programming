import java.util.*;

class Election
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of votes: ");
        int n = sc.nextInt();

        if(n < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            HashSet<Integer> voters = new HashSet<Integer>();

            int validVotes = 0;
            int duplicateVotes = 0;

            for(int i = 0; i < n; i++)
            {
                System.out.print("Enter voter ID: ");
                int id = sc.nextInt();

                if(id < 0)
                {
                    System.out.println("Invalid voter ID");
                    continue;
                }

                if(voters.contains(id))
                {
                    duplicateVotes++;
                }
                else
                {
                    voters.add(id);
                    validVotes++;
                }
            }

            System.out.println("Valid Votes: " + validVotes);
            System.out.println("Rejected Duplicate Votes: " + duplicateVotes);
        }

        sc.close();
    }
}