class Logic
{
    void productOfDigits(int num)
    {
        int digit = 0;
        int product = 1;

        while(num != 0)
        {
            digit = num % 10;
            product = product * digit;
            num = num / 10;
        }

        System.out.println("Product of digits = " + product);
    }
}

class Program
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.productOfDigits(234);
    }
}