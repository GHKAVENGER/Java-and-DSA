import java.util.*;
public class DAY_002_Recursion {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);


        //decresing numbers

        // System.out.println("enter the no =");
        // int a =scan.nextInt();
        // deb(a);


        //incresing numbers

        // System.out.println("enter the no =");
        // int a =scan.nextInt();
        // inc(a);


        //factorial
        // System.out.println("enter the no =");
        // int a =scan.nextInt();
        // System.out.println(fact(a));


        //sum of natural numbers
        // System.out.println("enter the no =");
        // int a =scan.nextInt();
        // System.out.println(sum(a));


        //fibinaccho
        // System.out.println("enter the no =");
        // int a =scan.nextInt();
        // System.out.println(fib(a));
        

        // //first occurance
        // System.out.println("enter the values into array");
        // System.out.println("how many values you want to enter");
        // int c=scan.nextInt();
        // int arr[]=new int[c];
        // for(int i=0;i<arr.length;i++){
        //     System.out.println("enter the value=");
        //     arr[i]=scan.nextInt();
        // }System.out.println("enter the element you want to search=");
        // int d=scan.nextInt();
        
        // System.out.println("thr element you searced in ");
        // System.err.println(lo(arr,d,arr.length-1));


        //power of number
        System.out.println("enter the number");
        int a=scan.nextInt();
        System.out.println("power of number");
        int b=scan.nextInt();
        System.out.println(exp(a, b));


        
    }
    public static void  deb(int a){
        if (a==1){ 
            System.out.println(a);          
            return;
        }
        System.out.println(a);
        deb(a-1);
    }

    public static void inc(int a){
        if (a==1){System.out.println(a);return;}
        inc(a-1);
        System.out.println(a);
    }

    public static int fact(int a){
        if (a==2){return 2;}
        int fact=a*fact(a-1);
        return fact;
    }

    public static int sum(int a){
        if(a==1){ return 1;}
        int sum=a+sum(a-1);
        return sum;
    }

    public static int fib(int a){
        if (a==2 || a==3){
            return 1;
        }
        int fib1=fib(a-1);
        int fib2=fib(a-2);
        int fib=fib1+fib2;
        return fib;
    }

    public static int fo(int a[] , int b ,int c){
        if(c==a.length){
            return -1;}
        if(b==a[c]){
            return c;
        }
        return fo(a,b,c+1);
    }
    public static int lo(int a[] , int b ,int c){        
        if(b==a[c]){
            return c;
        }
        if(c==0){
            return -1;}
        return lo(a,b,c-1);
        
    }

    public static int exp(int x ,int n){
        int num;
        if(n==1){return x;}
        num=x*exp(x,n-1);
        return num;
    }
    
}
