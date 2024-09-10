package Oops_package;

public class Interfaces implements Car,Person{ 
    @Override
    public void start(){
        System.out.println("car is starting");
    }

    @Override
    public void walk(){
        System.out.println("man is walking");
    }
    public static void main(String[] args) {
        Interfaces f1=new Interfaces();
    }
}
 
interface Car{   //by default all methods are abstract in interfaces
    void start();   //abstract keyword mein ham normal methods bana sakte he lekin interfaces mein nahi 
}

interface Person{
    void walk();
}



// there is no multilevel inheritance in Java supported that is one class cannot have multiple parents. So in order to tackle the situation in Java uses interfaces in which one class can implement multiple interfaces.
