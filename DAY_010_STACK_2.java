import java.util.*;
public class DAY_010_STACK_2 {
    public static String validparanthesis(String arr){
        Stack<Character> s=new Stack<>();
        int y=1;
        for(int i=0;i<arr.length();i++){
            if(arr.charAt(i)=='(' || arr.charAt(i)=='[' ||arr.charAt(i)=='{'){
                s.push(arr.charAt(i));
            }if(arr.charAt(i)==')' || arr.charAt(i)==']' ||arr.charAt(i)=='}'){
                if(s.isEmpty()){return "invalid paranthse";}
               
                if((s.get(i-y)=='(' && arr.charAt(i)==')') || (s.get(i-y)=='[' && arr.charAt(i)==']') || (s.get(i-y)=='{' && arr.charAt(i)=='}')){
                    s.pop();
                    y+=2;
                }
            }
        }if(s.isEmpty()){return "valid paranthesis";}else{return "invalid paranthesis";}
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter hte string");
        String str=scan.next();
        System.out.println(validparanthesis(str));
    }
    
}
