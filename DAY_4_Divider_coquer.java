import java.util.*;
public class DAY_4_Divider_coquer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many element do you want to enter");
        int o=scan.nextInt();
        int a[]=new int[o];
        for(int i=0;i<o;i++){
            System.out.println("enter the element");
            a[i]=scan.nextInt();
        }merge(a, 0, a.length);
        printarr(a);

        
    }

    //merge sort
    public static void merge(int a[] ,int str,int end){
        if (str>=end){
            return;
        }
        int mid=(str+end)/2; 
        merge(a,str,mid);
        merge(a,mid+1,end);
        com(a,str,mid,end);

    }

    public static void com(int a[],int str,int mid,int end){
        int temp[]=new int[end-str+1];
        int i=str;
        int j=mid+1;
        int te=0;
        while(i<=mid && j<=end){
            if(a[i]<a[j]){
                temp[te]=a[i];i++;
            }if(a[i]>a[j]){
                temp[te]=a[j];j++;
            }te++;
        }
        while(i<=mid){
            temp[te++]=a[i++];
        }while(j<=end){
            temp[te++]=a[j++];
        }for(int g=0;g<a.length;g++){
            a[g]=temp[g]; 
        }
    }
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.err.println(a[i]);
        }
    }
}
