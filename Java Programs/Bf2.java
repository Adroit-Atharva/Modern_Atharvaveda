
//java.io is a package in java to perform input and output operations
//It is a standard library that has files,streams,etc for performing I/O operations
import java.io.*;

public class Bf2{
    /*
     * String[] args is used to store command line arguments in the form of an array
     * of strings
     */

     //throws Exception is used to throw an exception/error which allows you to avoid try and catch
    public static void main(String[] args) throws Exception {
        int roll_no;
        String name;

        // system.in is an instance of InputStream class which is associated with the
        // stdinput stream i.e keyboard
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter roll no");

        // parseInt is a method in Integer class used for conerting string value to int
        // value i.e explicit type casting
        // Integer is a class stored in java.lang.Integer
        roll_no = Integer.parseInt(br.readLine());

        System.out.println("Enter name");
        name = br.readLine();

        System.out.println("Roll no is " + roll_no);
        System.out.println("Name is " + name);

    }
}