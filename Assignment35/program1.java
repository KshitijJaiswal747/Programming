import java.util.*;

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

    public SinglyLL()
    {
        first = null;
    }

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

    public boolean Search(int no)
    {
        Node temp = first;

        while(temp != null)
        {
            if(temp.data == no)
            {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }
}

class program1
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

        System.out.print("Enter element to search : ");
        int no = sobj.nextInt();

        if(obj.Search(no))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }

        sobj.close();
    }
}