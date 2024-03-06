import java.util.Scanner;

public class Coins{
	public static void main(String[] args)
	{
		
		int coins, secondCoins, quarters, dimes, nickles, pennies;

		Scanner input = new Scanner(System.in); // "input" can be anything
		System.out.println("Enter whole number from 1 to 99: ");

		coins = input.nextInt();
		secondCoins = coins;

		quarters = coins / 25;
		coins = coins % 25;

		dimes = coins / 10;
		coins = coins % 10;

		nickles = coins / 5;
		coins = coins % 5;

		pennies = coins;

		System.out.println(secondCoins + " in coins:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickles + " nickles");
		System.out.println(pennies + " pennies");



	}
}
