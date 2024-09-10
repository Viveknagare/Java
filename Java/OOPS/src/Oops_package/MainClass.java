package Oops_package;

import java.util.*;

import encapsulation.Encapsulation;

public class MainClass{
    public static void main(String[]args){
        // Person p1=new Person();
        // p1.age=20;
        // p1.name="vivek";

        // Person p2=new Person(20,"sakshi"); //here we initiate the properties of object using the constructor

        // System.out.println("my name is "+p2.name+" my age is "+p2.age+" i am a girl");
        // System.out.println("my name is "+p1.name+" my age is "+p1.age+" i am a boy");
        // p2.walk();

        // Person p3=new Person();
        // p3.walk(10000);
        // System.out.println(Person.count); 


        // Developer d1=new Developer(20,"viv");
        // System.out.println("my name is "+d1.name+" i am "+d1.age+" yrs old i am a developer");
        // d1.walk();

        Encapsulation.dowork(); // as the method dowork is static it belongs to class
        // Laptop l1=new lapi
        Laptop l1=new Laptop();
        System.out.println(l1.getvalue());  //printed value as was 100
        l1.setvalue(200);   // value changed to 200
        System.out.println(l1.getvalue());  //printed 200
        
    }
}


class Person{
    int age;   //by default iske values null hoge we need to make a object and then that object will have some names
    String name;
    public static int count;

    public Person(){       //Default constructor
        count++;
        System.out.println("default constructor is running");
    }
 
    public Person(int age,String name){      //constructor overloading   //parameterized constructor
        this(); // default constructor ko call krenge so that count ka value bhi increment hoga 
        this.age=age;   //iss class ke age mein paramter mein aya hua age daldo
        this.name=name;// iss class ke name me parameter mein aya hua name daldo
    }

    void walk(){
        System.out.println(name+" is walking");
    }

    void walk(int steps){   //method overloading 
        System.out.println(name+" is walking and walked "+steps+ " steps");  // yaha name will take value of the object.name from the object that has called this function otherwise if no value is assigned to object.name then it will take null
    }

    //here above we see polymorphism in walk function
    //polymorphism occurs in compile time and checks which function needs to be called before running the program
}

class Developer extends Person{
    public Developer(int age,String name){
        super(age,name); // this super keyword calls constructor of parent class as we are making object of developer but developer is also a person .
    }

    void walk(){   // whenever we call walk using object of Developer it first checks it in developer class if it finds it then it executes if it do not find it it goes to the parent class for search
        System.out.println(name+" developer is walking"); //Runtime polymorphism method overriding
    }
}



//getters and setters


class Laptop{
    int ram;
    private int price=100;    //now no one can access this price value even admin also so to change this private price we have getters and setters
    boolean isadmin=true;

     public int getvalue(){
        return price;
    };
     public void setvalue(int val){
        //the value of private can be changed by admin only so check whether the user is admin or not
       if(!isadmin){
        this.price=val;
       }else{
        System.out.println("you are not the admin");
       }
       
    };
}



//abstraction and encapsulation both works for data hiding but there is disimilarity
// in java there are two things abstract keyword and interfaces from both we can achieve data abstraction