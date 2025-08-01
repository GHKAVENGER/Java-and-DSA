public class DAY_008_Linked_List {
    public static class Node {
        int data;
        Node next  ;
        public Node(int data){
            this.data=data;
            this.next= null;
        }        
    }public static Node head;
    public static Node tail;
    public void add(int data){
        Node newnode=new Node(data);
        if(head==tail){
            head=tail=newnode;
        }
        newnode.next=head;
        head=newnode;
    }
    public void tail(int data){
        Node newnode=new Node(data);
        if (head== null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }

    public static void print(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node temp=head;
        while(temp!= null){
            System.err.println(head.data);
            temp=temp.next;
        }System.out.println();
    }
    public static void main(String[] args) {
        DAY_008_Linked_List ll=new DAY_008_Linked_List();
        ll.add(1);
        ll.print();
        ll.add(2);
        ll.print();
        ll.tail(3);
        ll.print();
        ll.tail(4);
        ll.print();
        ll.tail(5);
         
    }
    
}
