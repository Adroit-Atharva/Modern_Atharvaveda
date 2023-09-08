import java.io.*;

public class Table{
    public static void main(String[] args) throws Exception{
        int number;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        number = Integer.parseInt(br.readLine());


        // Print the multiplication table of the number
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);

        }
    }
}