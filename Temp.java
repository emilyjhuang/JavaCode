import java.util.Scanner;

public class Temp{

	public static void main(String[] args)
	{
		// user input
		double [] temperature = new double[7];
		Scanner input = new Scanner(System.in); // "input" can be anything
		System.out.println("Enter 7 temperatures: ");

		double sum = 0;
		for (int i = 0; i < 7; i++)
		{
			temperature[i] = input.nextDouble();
			sum += temperature[i];
		}

		double average = sum /7;
		System.out.println("The average is "+ average);

		for (int i = 0; i <7; i++)
		{
			if (temperature[i] < average)
			
				System.out.println(temperature[i] +" is below average");
			
			else if (temperature[i] > average)
			
				System.out.println(temperature[i] +" is above average");

			else

				System.out.println(temperature[i] +" is equal to the average");
		}

	

	}



}
