import java.util.Scanner;

class Arr {
    int num;
    Scanner scn = new Scanner(System.in);

    int get_data() {
        System.out.println("Enter a random number:");
        num = scn.nextInt();
        return num;
    }
}

public class Sept61 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array: ");
        n = sc.nextInt();

        Arr a = new Arr();

        int[][] A1 = new int[n][n];

        // i is the number of rows
        // 0
        for (int i = 0; i < n; i++) {
            // j is the number of colums
            // 0, 1, 2
            for (int j = 0; j < n; j++) {
                // A[0][0], A[0][1], A[0][2]
                A1[i][j] = a.get_data();
            }
        }

        // Print the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A1[i][j] + " ");
            }
            // Move to the next line for the next row
            System.out.println(); 
        }

        sc.close();
    }
}