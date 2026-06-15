class Logic
{
    void sumOfDigits(int num)
    {
        int digit = 0;
        int sum = 0;

        while(num != 0)
        {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits : " + sum);
    }
}

class program1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(1234);
    }
}