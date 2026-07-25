class GenericMultiply
{
    public static <T extends Number> double Multiply(T no1, T no2)
    {
        return no1.doubleValue() * no2.doubleValue();
    }

    public static void main(String[] args)
    {
        double iRet = Multiply(10, 20);
        System.out.println("Multiplication of Integers : " + iRet);

        double fRet = Multiply(10.0f, 20.0f);
        System.out.println("Multiplication of Floats : " + fRet);
    }
}