import java.util.Scanner;

public class CreditCardCheck{
	public static void main(String[] args)
	{

		int savingsAcc;
		double balance, savingsBalance;

		Scanner accbalance = new Scanner(System.in);
		System.out.println("Enter your current checking balance: ");
		balance = accbalance.nextDouble();

		Scanner savings = new Scanner(System.in);
		System.out.println("Do you have a savings account: (Enter 1 or 0) ");
		savingsAcc = savings.nextInt();

		if (savingsAcc == 0)
		{
			System.out.println("Sorry! You cannot have a credit card from our bank.");

		}
		if (savingsAcc == 1)
		{
			Scanner savingsB = new Scanner(System.in);
			System.out.println("Enter your current savings balance: ");
			savingsBalance = savingsB.nextDouble();

			if (savingsBalance + balance > 5000)
			{
				System.out.println("Credit Card is approved.");
			}
			else
			{
				System.out.println("Sorry! You cannot have a credit card from our bank.");
			}
		}

	}
}