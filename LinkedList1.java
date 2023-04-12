import java.util.*;

class Node{
    int a;
    Node next;

    Node(int a)
    {
        this.a=a;
        this.next=null;
    }
}

class LinkedList1
{
    Node head;

    public void add(int a)
    {
        Node no = new Node(a);
        Node curr=head;
        if(head==null)
        {
            head = no;
            return;
        }
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next = no;
    }

    public void Search(int a)
    {
        Node no = new Node(a);
        Node curr=head;
        if(head==null)
        {
            System.out.print("This string is empty.");
            return;
        }
        int i=1;
        while(curr!=null)
        {
            if(curr.a==a)
            {
                System.out.print("Index : "+i);
                return;
            }
            curr=curr.next;
            i++;
        }
    }

    public void display()
    {
        if(head==null)
        {
            System.out.print("This string is empty.");
            return;
        }
        Node curr=head;

        while(curr!=null)
        {
            System.out.print(curr.a+" ");
            curr=curr.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args)
    {
        LinkedList1 list = new LinkedList1();
        Scanner x = new Scanner(System.in);

        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        list.display();
        int n = x.nextInt();
        list.Search(n);
    }
}