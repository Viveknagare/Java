package Oops_package;

public class Abstraction {
    public static void main(String[] args) {
        // Car c1=new Car();
        // c1.start();   yeh Car ka object banake kuch faida nahi he kyuki car toh bas ek concept hein toh usse ham abstract kr dete hein
        Audi a1=new Audi();
        a1.start();
    }
}

class Audi extends Car{
    @Override
    void start(){
        System.out.println("Audi is starting");
    }
}

class BMW extends Car{
    @Override
    void start(){
        System.out.println("BMW is starting");
    }
}

abstract class Car{   //abstract matlab bas ek concept hein iska aisa koyi object nahi bana sakte
    String brand;
    int price;

    abstract void start();  //abstract methods do not have any definations aur abstract methods ko override krna he padta hein child methods mein
    //mujhme kuch code mat likho mein abstract huu mere absract method ka implementation mere child class dege
    //abstract function banaya toh uske class ko bhi abstract banana jaruri hein
}
