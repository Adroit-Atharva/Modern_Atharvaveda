import java.util.*;

class Prime1{
    // num is a reference variable 
    //  num = 1, 2, 3, 4
    void prime_num(int num){ 
        int flag=0;
        // num = 17
        // i = 2
        for(int i=2; i<num ; i++){
            // % is used to find the remainder
            // 4 % 2= 0
            if(num % i == 0){
                // if flag =1 then the number is not prime
                flag = 1;
                break;
            }
        }

        if(flag==0){
            System.out.println(num + " is prime");
        }
        else{
            System.out.println(num+ " is not prime:");
        }
    }
}

public class P{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Prime1 obj1 = new  Prime1();        


        System.out.println("Enter a number:\n");
        int n = sc.nextInt();

        for(int j=1; j<=n; j++){
            // j=1, j = 2, j =3, j=4, j=5
            obj1.prime_num(j);
        }

        sc.close();
    }
}

