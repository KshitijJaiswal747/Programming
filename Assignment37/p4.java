class GenericMaxArray
{
    public static <T extends Comparable<T>> T Max(T[] arr)
    {
        T max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i].compareTo(max) > 0)
            {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args)
    {
        Integer arr[] = {10,20,30,40,50};
        Float brr[] = {10.0f,3.7f,9.8f,8.7f};

        System.out.println("Largest Integer : " + Max(arr));
        System.out.println("Largest Float : " + Max(brr));
    }
}