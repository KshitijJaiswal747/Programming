import java.util.*;

class CharacterFrequency
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            boolean alreadyCounted = false;

            // Check whether character was already counted
            for(int k = 0; k < i; k++)
            {
                if(str.charAt(k) == ch)
                {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted)
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

            System.out.println(ch + " → " + count);
        }

        sc.close();
    }
}