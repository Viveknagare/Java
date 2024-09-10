package encapsulation;

public class Encapsulation {

    protected static void id(){   // now this can be accessed only by its child classes , no matter in which package the childclass is 
        System.out.println("you are having id");  //protected access modifier comes under data hiding
        //by default encapsulation is achieved where a class contains methods and props related to one things and hides it from others
    }
    public static void dowork(){   // as this is public this can be accessed outside the encapsulation also in another packages
        System.out.println("i am working");
    }

    static void getrest(){    //default access modifier-visibility only in this package in any class
        System.out.println("resting!");
    }

    private static void getsleep(){  // visibility in only this class of the package and not in other classes
        System.out.println("sleeping");
    }
    public static void main(String[] args) {
        getsleep();
    }
} 



//now the jvm asks for which class to run Encapsulation class or the See class , when see was not there bydefault it runs Encapsulation.main() method because there are two main methods
//there should be only one method as main because in multiple main methods of different classes jvm will get confuse which main method to call
class See{
     void main(){    // this name of main needs to be changed and then it should be called in main method above
        System.out.println("system running");
    }
}

class Seee extends See{
    static int age;
}
