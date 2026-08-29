import java.util.*;

class LongestWord
{
    public static void main(String A[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        String longest = "";

        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() > longest.length())
            {
                longest = words[i];
            }
        }

        System.out.println("Longest word: " + longest);

        sc.close();
    }
}