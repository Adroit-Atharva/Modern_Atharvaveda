// import java.io.*;

class Table {
    // int n;

    void get_data() throws Exception{
         // br object of Bufferedreader class
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // System.out.println("Enter a number:\n");
    }

    void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + "*" + i + "=" + n*i + "\n");
        }
    }
}

public class Sept7 {
    public static void main(String[] args) throws Exception{
        int n;
        // only reference is created of Table. which doesn't
        Table obj1;
        obj1 = new Table();

        // type casting string to int 
        n = Integer.parseInt(args[0]);

        obj1.get_data();
        obj1.table(n);
    }
}
