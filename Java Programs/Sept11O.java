class A{
    void display(){
        System.out.print("You are in class A\n");
    }
}


// We have redefined display() method of Class A in class B
class B extends A{
    void display(){

        // super keyword is used to call the parent method or constructor
        super.display();

        System.out.println("You are in class B\n");
    }
}

public class Sept11O {
    public static void main(String[] args) {

        B obj1 = new B();

        obj1.display();
    }
}
