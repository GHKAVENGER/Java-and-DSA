import java.util.*;
public class DAY_009_STACK_1 {
    

    //STACK USING ARRAYLIS

    static class stack{
        static ArrayList<Integer> al= new ArrayList<>();
        public static boolean isempty(){
            return al.size()==0;
        }
        public static void push(int data){
            al.add(data);
        }
        public static int pop(){
            int ter=al.get(al.size()-1);
            al.remove(al.size()-1);
            return ter;            
        }
        public static int peek(){
            return al.get(al.size()-1);
        }
    }

    // // STACK USING LINKED LIST
    // static class node{
    //     int data;
    //     node next;
    //     public node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // static class stack{
    //     static node head=null;
    //     public static void push(int data){
    //         node newnode=new node(data);
    //         if(isempty()){
    //             head=newnode;return;
    //         }
    //         newnode.data=data;
    //         newnode.next=head;
    //         head=newnode;            
    //     }
    //     public static boolean isempty(){
    //        return head==null;
    //     }
    //     public static int pop(){
    //         if(isempty()){
    //             return -1;
    //         }
    //         int h=head.data;
    //         head=head.next;
    //         return h;
    //     }
    //     public static void peek(){
    //         System.out.println(head.data);
    //     }
    // }

    // question 1 bottom push
    public static void pb(Stack<Integer> a,int c){
        
        // question 1
        if(a.isEmpty()){a.push(c);return;}
        int pop=a.pop();
        pb(a,c);
        a.push(pop);       

    }   
    public static void pr(Stack<Integer> a){
        while (!a.isEmpty()) {
            System.out.println(a.pop()); 
        }
    }

    //   //QUESTION THE STACK(REVERSE THE STACK)
    public static void reversestack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int a=s.pop();
        reversestack(s);
        pb(s, a);
    }

    // LARGEST RIGHT ELEMENT
    public static void lr(int arr[]){
        int len=arr.length;
        int ar[]=new int[len];
        ar[len-1]=-1;
        for(int i=0;i<len-1;i++){
            int a=arr[i];
            // System.err.println(a);
            for (int j=i+1;j<len;j++){
                if(a<arr[j]){
                    a=arr[j];
                    break;
                }
            }if(a==arr[i]){ar[i]=-1;}else{ar[i]=a;}
        }
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

    }
      

    

    
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);


        // Stack<Integer> s=new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // pb(s, 4);
        // while (!s.isEmpty()) {
        //     System.out.println(s.pop()); 
        // }


        // question 2 (REVERSE A STRING)
        // System.out.println("enter the string");
        // String str=scan.nextLine();
        // Stack<Character> reverse=new Stack<>();
        // for(int i=0;i<str.length();i++){
        //     reverse.push(str.charAt(i));
        // }for(int i=0;i<str.length();i++){
        //     System.out.print(reverse.pop());
        // }

        //QUESTION THE STACK(REVERSE THE STACK)
        // Stack<Integer> st=new Stack<>();
        
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // // pr(st);
        // reversestack(st);
        // pr(st);


        //next greater element
        int arr[]={6,8,0,1,3};
        lr(arr);
        
        
    }
}
