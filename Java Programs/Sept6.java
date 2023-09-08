// Array of objects 

import java.util.Scanner;

class Arrays1 {
    Scanner scn = new Scanner(System.in);

    int roll_no;
    String name;
    float marks;

    public void get_data() {
        System.out.println("Enter the roll number of the student  :");
        this.roll_no = scn.nextInt();

        System.out.println("Enter the Name of the student:");
        this.name = scn.next();

        System.out.println("Enter the marks of the student:");
        this.marks = scn.nextFloat();
    }

    public void disp_data(){
        System.out.println("roll no is " + roll_no + "Name is " + name + "Marks is " + marks);
    }

}

public class Sept6 {
    public static void main(String[] args) throws Exception{
        int n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students : \n");
        n = sc.nextInt();

        Arrays1[] a = new Arrays1[n];

        for(int i = 0; i < n; i++){
            a[i] = new Arrays1();

            a[i].get_data();
            a[i].disp_data();
        }
        sc.close();
    }
}