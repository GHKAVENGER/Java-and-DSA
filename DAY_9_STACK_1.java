import java.util.*;
public class DAY_9_STACK_1 {
    

    //STACK USING ARRAYLIS

    // static class stack{
    //     static ArrayList<Integer> al= new ArrayList<>();
    //     public static boolean isempty(){
    //         return al.size()==0;
    //     }
    //     public static void push(int data){
    //         al.add(data);
    //     }
    //     public static int pop(){
    //         int ter=al.get(al.size()-1);
    //         al.remove(al.size()-1);
    //         return ter;            
    //     }
    //     public static int peek(){
    //         return al.get(al.size()-1);
    //     }
    //}

    //STACK USING LINKED LIST
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        static node head=null;
        public static void push(int data){
            node newnode=new node(data);
            if(isempty()){
                head=newnode;return;
            }
            newnode.data=data;
            newnode.next=head;
            head=newnode;            
        }
        public static boolean isempty(){
           return head==null;
        }
        public static int pop(){
            if(isempty()){
                return -1;
            }
            int h=head.data;
            head=head.next;
            return h;
        }
        public static void peek(){
            System.out.println(head.data);
        }
    }

    
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isempty()) {
            System.out.println(s.pop());            
        }
        
    }
}
