class Logic
{
    void findLargestDigit(int num)
    {
        int digit = 0;
        int max = 0;

        while(num != 0)
        {
            digit = num % 10;

            if(digit > max)
            {
                max = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest digit : " + max);
    }
}

class program4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}