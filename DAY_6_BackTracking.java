import java.util.*;
public class DAY_6_BackTracking {
    public static void changearr(int arr[],int a,int b){
        if(a==arr.length){
            printar(arr);
            return;
        }
        arr[a]=b;
        changearr(arr, a+1, b+1);
        arr[a] =arr[a]-2;
    }
    public static void printar(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int arr[]=new int[5];
        changearr(arr,0,1);
        printar(arr);
    }
    
}
