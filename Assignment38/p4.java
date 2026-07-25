class GenericSearchLast
{
    public static <T> int SearchLast(T[] arr, T value)
    {
        for(int i = arr.length - 1; i >= 0; i--)
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

        int iRet = SearchLast(arr,40);

        System.out.println("Last Occurrence : " + iRet);
    }
}