class LinkList1
{
    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    Node head;
    int size;

    LL(){
        this.size=0;
    }

    public void addF(String data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    public void addL(String data)
    {
        Node newnode = new Node(data);
        if(head == null)
        {
            head = newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next != null)
        {
            currnode = currnode.next;
        }
        currnode.next = newnode;
    }

    public void delF()
    {
        if(head == null)
        {
            System.out.println("This string is empty.");
            return;
        }
        size--;
            head=head.next;
    }

    public void delL()
    {
        if(head == null)
        {
            System.out.println("This string is empty.");
            return;
        }
        size--;
        Node secLast = head;
        Node last = head.next;
        while(last.next!=null)
        {
            last = last.next;
            secLast = secLast.next;
        }
        secLast.next = null;
    }

    public void print()
    {
        if(head == null)
        {
            System.out.println("This String is empty");
            return;
        }
        Node currnode = head;
        while(currnode != null)
        {
            System.out.print(currnode.data+" ");
            currnode=currnode.next;
        }
        System.out.println(" -> NULL");
    }
    int getSize(){
        return size;
        }

    public static void main(String[] args)
    {
        LinkList1 list = new LinkList1();

        list.print();
        list.addF("Yuvraj");
        list.print();
        list.addF("The");
        list.print();
        list.addL("Kathad");
        list.print();
        System.out.println(list.getSize());
        list.delF();
        list.print();
        System.out.println(list.getSize());
        list.delL();
        list.print();
    }
}