class GenericReverse
{
    public static <T> void Reverse(T[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start < end)
        {
            T temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        Integer arr[] = {10,20,30,10,30,40,10,40,10};

        System.out.print("Before Reverse : ");
        for(Integer i : arr)
        {
            System.out.print(i + " ");
        }

        Reverse(arr);

        System.out.print("\nAfter Reverse : ");
        for(Integer i : arr)
        {
            System.out.print(i + " ");
        }
    }
}