import java.util.*;
public class DAY_003_Recursion_2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //removing duplicates in string
        System.out.println("enter the string");
        String a=scan.nextLine();
        String c="";
        System.out.println(remdup(a,c,0));
        
    }

    //removing duplicates in string
    public static String remdup(String a,String c,int b){
        if(b==a.length()){
            return c;
        }
        char d=a.charAt(b);
        boolean t=true;
        for(int i=b-1;i>=0;i--){
            if(a.charAt(i)==d){t=false;break;}
        }if(t==true){c+=d;}        
        String u=remdup(a,c, b+1);
        return u;
    }
    
}
