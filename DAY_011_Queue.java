import java.util.*;;


//QUEUE USING ARRAY
public class DAY_011_Queue {
    
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
    
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }
        public static void add(int a){
            if((rear)%size-1==front ){
                System.out.println("arr is full");return;
            }if(front==-1){front=0;}
            rear=(rear+1)%(size);
            arr[rear]=a;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println(" arr is empty");
            }int front=arr[0];
            int result=arr[front];
            front=(front+1)%size;
            if(front==rear){front=rear=-1;}else{front=(front+1)%size;}  
            return result;      
        }
        public static void peek(){
            if(isEmpty()){
                System.out.println(" arr is empty");return;
            }System.out.println(arr[front]);return;
        }
    
    }

    public static void main(String[] args) {
        Queue que=new Queue(6);
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        while (!que.isEmpty()) {
            que.peek();
            que.remove();
            
        }

    
        
        
    }
}

