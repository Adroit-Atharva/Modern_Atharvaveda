// 

import java.util.*;

class Account {
    int accno;
    String accname;
    double balance;

    public Account(int accno, String accname, double balance) {
        this.accno = accno;
        this.accname = accname;
        this.balance = balance;
    }

    public void displayAccount() {
        System.out.println("Account [accno=" + accno + ", accname=" + accname + ", balance=" + balance + "]");
    }

    // This is a static 
    public static void sortAccount(Account[] accounts) {
        int l = accounts.length;

        // we are using bubble sort algo to sort the accounts on the basis of balance
        for (int i = 0; i < l - 1; i++) {
            for (int j = 0; j < l - i - 1; j++) {
                // Compare account balances and swap if necessary
                if (accounts[j].balance > accounts[j + 1].balance) {
                    // Swap accounts[j] and accounts[j + 1]
                    Account temp = accounts[j];
                    accounts[j] = accounts[j + 1];
                    accounts[j + 1] = temp;
                }
            }
        }
    }
}

public class Set_B_Q3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of accounts (n): ");
        int n = scanner.nextInt();

        // Create an array of Account objects
        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Account " + (i + 1));
            System.out.print("Account Number: ");
            int accno = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Account Name: ");
            String accname = scanner.nextLine();
            System.out.print("Account Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            accounts[i] = new Account(accno, accname, balance);
        }


        System.out.println("The account details before sorting: \n");
        for (int i = 0; i < n; i++) {
            accounts[i].displayAccount();
        }

        // Sort the array based on balance without using a Comparator
        Account.sortAccount(accounts);

        System.out.println("The account details after sorting according to the balance is : \n");
        // Display account details in sorted order using the displayAccount method
        for (int i = 0; i < n; i++) {
            accounts[i].displayAccount();
        }

        // Close the scanner
        scanner.close();
    }
}
