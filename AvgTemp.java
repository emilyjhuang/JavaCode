pacakage subarray
import java.util Scanner;

public class AvgTemp{

	public static void main(String[] args){
	final int numdays = 10
	final int numhours = 24;;
	double [] [] [] data = new double [numdays][humhours][2];

	Scanner input = new Scanner(System.in);
	for (int k = 0; k <numdays* numhours; k++)
	{
		int day = input.nextInt();
		int hour = input.nextInt();
		double temp = input.nextDouble();
		double humidity = input.nextDouble();
		data[day-1][hour-1][0] = temp;
		data[day-1][hour-1][1] = humidity;
	}

	for (int i = 0; i < numdays; i++)
	{
		double dailytemptotal = 0; dailyhumtotal = 0;
		for (int j = 0; j < numhours; j++)
		{
			dailytemptotal += data[i][j][0];
			dailyhumtotal += data[i][j][1];
		}
	}
	}
	System.out.print("Day " + i + "'s average temperature is " + );
	System.out.print("Day " + i + "'s average humidiiy is " + );
	

}