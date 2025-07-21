import java.util.*;
public class DAY_5_Complexity {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
    
    
     //simple loop  O(n)
     int n=100;
     for(int i=0;i<n;i++){
        System.out.println("hellow hemanth");
     }
    
     //nested loop  O(n2)
     for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            System.out.println("hellowworld");
        }
     }

     //nested loop 2 O(n2)
     for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            System.out.println("hellowworld");
        }
     }

    }
    
}
