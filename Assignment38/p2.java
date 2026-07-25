class GenericFrequency
{
    public static <T> int Frequency(T[] arr, T value)
    {
        int count = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(value))
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        Integer arr[] = {10,20,30,10,30,40,10,40,10};

        int iRet = Frequency(arr, 10);

        System.out.println("Frequency : " + iRet);
    }
}