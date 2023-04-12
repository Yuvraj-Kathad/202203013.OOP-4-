class Node{
    int a;
    Node next;

    Node(int a)
    {
        this.a=a;
        this.next=null;
    }
}

class Del
{
    Node head;
    public void del(int a)
    {
        if(head==null)
        {
            System.out.print("Empty List.");
            return;
        }
        Node secLast = head;
        Node last = head.next;

        while(last.next!=null)
        {
            last = last.next;
            secLast = secLast.next;
        }
        secLast.next=null;
    }

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

    public void print()
    {
        if(head==null)
        {
            System.out.print("This list is empty");
            return;
        }
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.a+" ");
            curr=curr.next;
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        Del list = new Del();

        for(int i=1;i<=50;i++)
        {
            list.add(i);
            if(i>25)
                list.del(i);
        }
        System.out.println("");
        list.print();
    }
}