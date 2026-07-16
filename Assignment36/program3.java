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

    public int LastOccur(int no)
    {
        Node temp = first;
        int pos = 1;
        int last = -1;

        while(temp != null)
        {
            if(temp.data == no)
            {
                last = pos;
            }

            pos++;
            temp = temp.next;
        }

        return last;
    }
}

class LastOccurrence
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

        System.out.print("Enter element : ");
        int no = sobj.nextInt();

        int ans = obj.LastOccur(no);

        if(ans == -1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Last Occurrence Position : " + ans);
        }

        sobj.close();
    }
}