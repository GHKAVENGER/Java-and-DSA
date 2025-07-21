import java.util.*;
public class DAY_5_Complexity {
    public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
    
    
    //  //simple loop  O(n)
    //  int n=100;
    //  for(int i=0;i<n;i++){
    //     System.out.println("hellow hemanth");
    //  }
    
    //  //nested loop  O(n2)
    //  for(int i=0;i<n;i++){
    //     for(int j=i;j<n;j++){
    //         System.out.println("hellowworld");
    //     }
    //  }

    //  //nested loop 2 O(n2)
    //  for(int i=0;i<n;i++){
    //     for(int j=0;j<i;j++){
    //         System.out.println("hellowworld");
    //     }
    //  }

     int a=scan.nextInt();
     int ar[]=new int[a];
     for(int i=0;i<ar.length;i++){ar[i]=scan.nextInt();}
     for (int i=0;i<ar.length-1;i++){
        for(int j=0;j<ar.length-1-i;j++){
            if(ar[j]>ar[j+1]){
                int temp =ar[j+1];
                ar[j+1]=ar[j];
                ar[j]=temp;
            }
        }
     }
     for(int i=0;i<ar.length;i++){System.out.println(ar[i]);}

    }
    
}
