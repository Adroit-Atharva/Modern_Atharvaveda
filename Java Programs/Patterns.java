import java.util.*;

public class Patterns {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter a number:\n");
        n = scn.nextInt();

        System.out.println();
        pattern4(n);
        scn.close();
    }

    // public static void pattern1(int n) {
    //     //This is outer loop
    //     for (int row = 1; row <= n; row++) {
    //         //This is inner loop
    //         for (int col = 1; col <= row; col++) {
            
    //             System.out.print("*\t");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void pattern2(int n) {

    //     for (int row = 1; row <= n; row++) {

    //         for (int col = 1; col <= n; col++) {

    //             System.out.print("*\t");
    //         }
    //         //This is used to break the line
    //         System.out.println();
    //     }
    // }

    // public static void pattern3(int n) {
    //     for (int row = 1; row <= n; row++) {
    //         for (int col = n+1-row; col <= row; col++) {
    //             System.out.print("*\t");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void pattern4(int n) {
        int num;
        // 1, 2, 3, 4, 5, 6, 7
        num=1; 
        //This is outer for loop
        //1, 2, 3, 4
        for (int row = 1; row <= n; row++) {
            //This is inner for loop
            //1
            for (int col = 1; col <= row; col++) {

                System.out.print(num + " ");
                num++;
                
            }
            //This is used to break the line
            System.out.println();
        }
    }
}