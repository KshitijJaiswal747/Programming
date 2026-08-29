import java.util.*;

class Anagram
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() != str2.length())
        {
            System.out.println("Not Anagram");
        }
        else
        {
            boolean flag = true;

            for(int i = 0; i < str1.length(); i++)
            {
                char ch = str1.charAt(i);

                int count1 = 0;
                int count2 = 0;

                for(int j = 0; j < str1.length(); j++)
                {
                    if(str1.charAt(j) == ch)
                    {
                        count1++;
                    }

                    if(str2.charAt(j) == ch)
                    {
                        count2++;
                    }
                }

                if(count1 != count2)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                System.out.println("Anagram");
            }
            else
            {
                System.out.println("Not Anagram");
            }
        }

        sc.close();
    }
}