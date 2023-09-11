
// Any Interface only has abstract methods
interface I1{
    // calculate is an abstract method 
    // calculate isn't defined in the Interface
    int calculate(int a, int b);
}

interface I2{
    // calculate is an abstract method 
    // calculate isn't defined in the Interface
    // we only declare methods in Interfaces
    void display();
}

// Any class that implements a particular Interface must define it's methods
// Multiple Interfaces
class Add implements I1, I2{
    public int calculate(int a, int b){
        return a+b;
    }

    public void display(){
        System.out.println("Hello");
    }
}

class Sub implements I1{
    public int calculate(int a, int b){
        return a-b;
    }
}

public class Interfaces1{
    public static void main(String[] args){
        Add obj1 = new Add();

        Sub obj2 = new Sub();

        int sum = obj1.calculate(10, 20);

        System.out.println("result is " + sum);

        int diff = obj2.calculate(10, 20);

        System.out.println("result is " + diff);
    }
}

