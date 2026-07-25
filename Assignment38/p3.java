class GenericSearchFirst
{
    public static <T> int SearchFirst(T[] arr, T value)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(value))
            {
                return i + 1;     // Position (1-based)
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Integer arr[] = {10,20,30,10,30,40,10,40,10};

        int iRet = SearchFirst(arr,40);

        System.out.println("First Occurrence : " + iRet);
    }
}