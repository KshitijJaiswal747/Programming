import java.util.*;

class DuplicateCharacters
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            boolean alreadyPrinted = false;

            // Check whether character appeared earlier
            for(int k = 0; k < i; k++)
            {
                if(str.charAt(k) == ch)
                {
                    alreadyPrinted = true;
                    break;
                }
            }

            if(alreadyPrinted)
            {
                continue;
            }

            int count = 0;

            for(int j = 0; j < str.length(); j++)
            {
                if(str.charAt(j) == ch)
                {
                    count++;
                }
            }

            if(count > 1)
            {
                System.out.print(ch + " ");
            }
        }

        System.out.println();

        sc.close();
    }
}