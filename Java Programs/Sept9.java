import java.util.*;

// This is class Account
class Account{
    int accno;
    String accname;
    double balance;

    // This is a parametarized constructor 
    // constructor is used to initialize the data members
    Account(int accno1, String accname1, double balance1){
        this.accno = accno1;
        this.accname = accname1;
        this.balance = balance1;
    }

    void disp_data(){
        System.out.println("accnum:" + accno + " accname" + accname + " balance:" + balance);
    }
}

public class Sept9{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of accounts:\n");
        int n = sc.nextInt();

        // n is the sizze of the array
        Account accounts[] = new Account[n];

        // if the array has 3 elements 0, 1, 2
        for(int i=0; i<n; i++){
            System.out.print("Enter the account number for: " + i);
            int accnum = sc.nextInt();

            System.out.print("Enter the account name for: " + i);
            String accname = sc.nextLine();

            System.out.print("Enter the balance for: " + i);
            double balance = sc.nextDouble();

            // this is where you are creating the elements in the array
            // the below line is used to store the elements in the array
            accounts[i] = new Account(accnum, accname, balance);
        }

        for(int i=0; i<n; i++){
            // 0th will be called, 1st element will be called, 2nd element will be called
            accounts[i].disp_data();
        }
       
       
        sc.close();
    }
}

