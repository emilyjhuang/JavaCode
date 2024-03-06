import java.util.Scanner;

public class BugInfest{
	
	public static final double GROWTH_RATE = 0.95;
	public static final double ONE_BUG_VOL = 0.002;
	public static void main(String[] args)
	{


	System.out.println("Enter the total volume of your house in cubic feet: ");
	Scanner keyboard = new Scanner(System.in);
	double houseVol = keyboard.nextDouble();

	System.out.println("Enter the estimated numebr of roaches: ");
	int roachPop = keyboard.nextInt();

	int countWeeks = 0;
	double population = roachPop;
	double totalBugVol = population * ONE_BUG_VOL;

	while (totalBugVol < houseVol)
	{
		double newBugs = population * GROWTH_RATE;
		double newBugVol = newBugs * ONE_BUG_VOL;
		population += newBugs;
		totalBugVol += newBugVol;
		countWeeks += 1;
	}

	System.out.println("Number of weeks to exeecd capacity of hosue: " + countWeeks);
	System.out.println("Number of roaches: "+ population);
	System.out.println("Volume of roaches: "+ totalBugVol);
	}
}