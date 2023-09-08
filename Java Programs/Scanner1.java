
//first import all the classes and files needed for the code
import java.util.*;

//create a class in which the entire code is written, Make sure that the name of the class is the same as the name of the java file
public class Scanner1 {
    public static void main(String[] args) throws Exception {
        int roll_no;
        String name;
        String name2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name and roll_no");

        name = sc.next();
        name2 = sc.nextLine();
        roll_no = sc.nextInt();

        System.out.println("Roll no " + roll_no + "Name is " + name + "Name2 is " + name2);

        sc.close();
    }
}