// This is imported to use function of Scanner class
import java.util.*;

class Calc{
    int a, b;

    // created an object of Scanner class to use function of class
    Scanner sc = new Scanner(System.in);

   
    // Constructor is used to initialize data members of an object
     //This is parametarized constructor 
    Calc(int x, int y){
        this.a = x;
        this.b = y;
        sc.close();
    }

    // This will always be called when the data members aren't initialzed
    // This is default contructor.
    Calc(){
        this.a=1;
        this.b=2;
    }
    
    int add(){
        return a+b;
    }
}


public class Class2{
    public static void main(String[] args) throws Exception{
        int sum, s;
        // c1 is just a reference of Calc class. Memory is not allocated to c1
        Calc c1, c2;

        // This will call default constructor
        c1 = new Calc();

        // This will call parametarized constructor
        c2 = new Calc(10, 20);

        sum = c1.add();
        s =  c2.add();
        System.out.println("The sum of default value is " + sum + "\nThe sum of parametrarized constructor is " + s);
    }
}