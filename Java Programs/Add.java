public class Add{
	public static void main(String[] args)
	{
/*variables in a class are known as data members and the functions in the class are known as member functions or methods*/


		int a,b,sum;
//Integer class is in java lang package, parseInt is used to take an integer as a command
 		a=Integer.parseInt(args[0]);

		b=Integer.parseInt(args[1]);

		sum=a+b;

		System.out.println("the sum of 2 numbers is:" + sum);
}
}