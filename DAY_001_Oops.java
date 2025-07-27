public class DAY_001_Oops{
    public static void main(String[] args) {


        //intro (student)

        // student s1=new student();
        // s1.name("hemanth");
        // System.out.println(s1.name);
        // s1.Standard=7;
        // System.out.println(s1.Standard);
        // s1.age=20;
        // int s=5;
        // System.out.println(s1.age);
        // student s2=new student(s1);
        //   s1.name="kumar";
        // System.out.println(s2.name);
        // System.out.println(s1.name);
        // System.out.println(s2.name);


        //base and derived class
        fish shark=new fish();
        shark.colour="blue";
        shark.eyes=2;
        shark.fins=4;
        shark.eat();
        shark.breath();
        shark.swim();


    }
    
}
class student{
     String name;
    int Standard;
    int age; 
    void name(String name){
        this.name=name;
    }
    void stan(int stan){
        Standard=stan;
    }    
    void age(int age){
        this.age=age;
    }
    student(){
        System.out.println("created");
    }
    student(student s1){
        this.name=s1.name;
        this.Standard=Standard;
        this.age=age;
    }
}



//base class
class animal{
    String colour;
    int eyes;
    void eat(){System.out.println("eat");}
    void breath(){System.out.println("breath");}
}

//derived class
class fish extends animal{
    int fins;
    void swim(){System.out.println("swim");}
}
