import java.util.ArrayList;
import java.util.*; 
public class DAY_7_Array_Lists {
    public static void swap(ArrayList<Integer> list , int a , int b){
        int temp=list.get(a);
        list.set(a,list.get(b));
        list.set(b,temp);
    }

    //maximum stored water
    public static void water(ArrayList<Integer> list){        
        int water=Integer.MIN_VALUE;
        int index1;
        int index2;

        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int length=j-i;
                int breadth;
                if(list.get(i)>list.get(j)){breadth=list.get(j);}else{breadth=list.get(i);}
                int drop=length*breadth;
                if(water<drop){
                    water=drop;
                    index1=i;
                    index2=j;
                }
            }
        }
        System.out.print("highest water can bestored is"+water+"from index");
        

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        //get operation
        System.out.println(list.get(3));

        //delete
        list.remove(3);
        System.out.println(list.get(3));

        //set 
        list.set(2, 9);
        System.out.println(list);


        //contains
        System.out.println(list.contains(5));

        //add element at index
        list.add(1,7);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //reverse of an array
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }

        //max of list
        int min=Integer.MIN_VALUE;
        for(int i=0 ;i<list.size();i++){
            if(min<list.get(i)){
                min=list.get(i);
            }
        }
        System.out.println();
        System.out.println(min);

        //swap
        System.out.println(list);
        swap(list, 3, 1);
        System.out.println(list);

        //sort
        Collections.sort(list);
        System.out.println(list);

        //sort in desending order
        Collections.sort(list , Collections.reverseOrder());
        System.out.println(list);

        //multidimentional arraylist
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        mainlist.add(list);
        System.out.println("new line");
        System.err.println(mainlist.get(0));

        //water storage
        ArrayList<Integer> lis=new ArrayList<>();
        lis.add(1);
        lis.add(8);
        lis.add(6);
        lis.add(2);
        lis.add(5);
        lis.add(4);
        lis.add(8);
        lis.add(3);
        lis.add(7);
        water(lis);



        

        
    }

}
