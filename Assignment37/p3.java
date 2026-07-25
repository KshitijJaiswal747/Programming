class GenericAdd
{
    public static <T extends Number> double AddN(T[] arr)
    {
        double sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i].doubleValue();
        }

        return sum;
    }

    public static void main(String[] args)
    {
        Integer arr[] = {10,20,30,40,50};
        Float brr[] = {10.0f,3.7f,9.8f,8.7f};

        System.out.println("Addition of Integers : " + AddN(arr));
        System.out.println("Addition of Floats : " + AddN(brr));
    }
}