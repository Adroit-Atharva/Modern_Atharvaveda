class Rev{
    int rem=0;
    int rev=0;


    int rev_num(int n){

        // n = 123

        while(n>0){
            // % is used to find the remainder. 123/10, 12 is quotient, remainder is 3, 12 % 10 = 2, 1 % 10 1
            rem = n % 10;
            // rev 0 + 3 = 3, 30 + 2 = 32, 32 * 10 = 320 + 1 = 321
            rev = rev*10+rem;
            // n= 12, n = 1, n = 0
            n = n/10;
        }

        return rev;
    }
}

public class Sept71{
    public static void main(String[] args) throws Exception{
        int n;
        int re;
        n = Integer.parseInt(args[0]);
        Rev r = new Rev();

        re = r.rev_num(n);

        System.out.println("The reverse of " + n + "is:" + re);
    }
}

