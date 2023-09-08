import java.util.*;

class Calc {
    // prime number is a number divisible by itself and 1
    void prime_num(int n) {

        int flag = 0;
        // from i till n 0,1,2,3,4
        // modulo or % is used to find the remainder
        // =(assignment operator) and ==(comparision operator)
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
            }
        }

        if (flag == 0) {
            System.out.print(" " + n + "is prime \n");
        }

    }
}

public class Sept8 {
    public static void main(String[] args) throws Exception {

        int n;
        // c1 is just a reference which doesn't have any memory
        Calc c1;
        c1 = new Calc();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:\n");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            c1.prime_num(i);
        }
        sc.close();
    }
}
