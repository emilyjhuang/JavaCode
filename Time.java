import java.util.Scanner; //need to use for user input

public class Time{
	public static void main(String[] args){
		int totalSeconds;

		int minuteInSeconds = 60;
		int hourInSeconds = 60 * minuteInSeconds;
		int dayInSeconds = 24 * hourInSeconds;

		int numDays, numHours, numMinutes, numSeconds;

		//read in (int) number of seconds ot be converted
		Scanner input = new Scanner(System.in); //use new to reserve space in memory
		System.out.print("Enter (integer) total number of seconds: ");
		totalSeconds = input.nextInt(); // convert to integer

		numDays = totalSeconds /dayInSeconds;
		totalSeconds = totalSeconds % dayInSeconds;

		numHours = totalSeconds / hourInSeconds;
		totalSeconds = totalSeconds % hourInSeconds;

		numMinutes = totalSeconds / minuteInSeconds;
		totalSeconds = totalSeconds % minuteInSeconds;

		System.out.println("This is equal to: ");
		System.out.println(numDays + " days");
		System.out.println(numHours + " hours");
		System.out.println(numMinutes + " minutes");
		System.out.println(totalSeconds + " seconds");
		//good form to close the input
		input.close();
	}
}

	