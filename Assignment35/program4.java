import java.util.Scanner;

class Node
{
    public int data;
    public Node next;

    public Node(int no)
    {
        data = no;
        next = null;
    }
}

class SinglyLL
{
    private Node first;

    public void InsertLast(int no)
    {
        Node newn = new Node(no);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            Node temp = first;

            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
        }
    }

    public int Frequency(int no)
    {
        int count = 0;

        Node temp = first;

        while(temp != null)
        {
            if(temp.data == no)
            {
                count++;
            }

            temp = temp.next;
        }

        return count;
    }
}

class FrequencyOfElement
{
    public static void main(String args[])
    {
        Scanner sobj = new Scanner(System.in);

        SinglyLL obj = new SinglyLL();

        System.out.print("Enter number of elements : ");
        int n = sobj.nextInt();

        System.out.println("Enter elements :");

        for(int i = 1; i <= n; i++)
        {
            obj.InsertLast(sobj.nextInt());
        }

        System.out.print("Enter number to find frequency : ");
        int no = sobj.nextInt();

        System.out.println("Frequency : " + obj.Frequency(no));

        sobj.close();
    }
}  