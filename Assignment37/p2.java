class GenericMax3
{
    public static <T extends Comparable<T>> T Max(T no1, T no2, T no3)
    {
        T max = no1;

        if(no2.compareTo(max) > 0)
        {
            max = no2;
        }

        if(no3.compareTo(max) > 0)
        {
            max = no3;
        }

        return max;
    }

    public static void main(String[] args)
    {
        System.out.println("Largest Integer : " + Max(10, 50, 30));
        System.out.println("Largest Float : " + Max(10.5f, 7.8f, 15.2f));
    }
}