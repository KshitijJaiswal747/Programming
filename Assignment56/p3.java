import java.util.*;

class Pangram
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        boolean flag = true;

        for(char ch = 'a'; ch <= 'z'; ch++)
        {
            boolean found = false;

            for(int i = 0; i < str.length(); i++)
            {
                if(str.charAt(i) == ch)
                {
                    found = true;
                    break;
                }
            }

            if(!found)
            {
                flag = false;
                break;
            }
        }

        if(flag)
        {
            System.out.println("Pangram");
        }
        else
        {
            System.out.println("Not Pangram");
        }

        sc.close();
    }
}