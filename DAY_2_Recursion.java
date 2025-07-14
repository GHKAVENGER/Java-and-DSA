import java.util.*;
public class DAY_2_Recursion {
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
        System.out.println("enter the no =");
        int a =scan.nextInt();
        System.out.println(fib(a));
        
        
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
}
