class Logic
{
    void findSmallestDigit(int num)
    {
        int digit = 0;
        int min = 9;

        while(num != 0)
        {
            digit = num % 10;

            if(digit < min)
            {
                min = digit;
            }

            num = num / 10;
        }

        System.out.println("Smallest digit : " + min);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
    }
}