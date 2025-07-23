public class DAY_8_Linked_List {
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
    public static void main(String[] args) {
        DAY_8_Linked_List ll=new DAY_8_Linked_List();
        ll.add(1);
        ll.add(2);
        ll.tail(3);
        ll.tail(4);
        ll.tail(5);
        System.out.println(ll);
         
    }
    
}
