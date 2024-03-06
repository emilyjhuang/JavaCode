import java.util.Scanner;

public class Balance{
	public static void main(String[] args)
	{
		
		final double penalty = 25.00;
		final double interest = 0.05;

		double balance;

		Scanner input = new Scanner(System.in); // "input" can be anything
		System.out.println("Enter initial balance: ");

		balance = input.nextDouble();

		System.out.print("Your initial balance is:" + balance);

		if (balance >0)
		
			balance += (interest * balance);
		
		else
		
			balance -= penalty;
		

		System.out.print("Your last balance is:" + balance);




	}
}