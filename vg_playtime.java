import java.util.Scanner;

public class vg_playtime {
	

	public static int GameMinutes(int[][] arr, int studentId, int beginDay, int endDay)
	{
int total = 0;
for (int i = beginDay; i <= endDAy; i++)
{
	total += arr[i][student];

}
	return total;

	}
	public satic void main(String [] args){

	int [] arr = {{30, 45, 0, 30, 20 , 30},
				{30, 45, 0, 30, 20 , 30},
				{30, 0, 30, 0, 50 , 45},
				{30, 45, 45 ,15, 45, 60},
				{60, 0 , 45, 60, 15, 60},
				{120, 60, 240, 0 , 120 , 180},
				{120, 60, 240, 0, 0, 100}};


	Scanner input = new Scanner(System.in);
	int stId, d1, d2;
	System.out.println("Enter the student index [0,5]: ");
	stId = input.nextInt();

	System.out.println("Enter control day 1 and day 2 in the format of");
	System.out.println("Monday: 1, Tuesday: 2, Wednesday: 3 and so on ");
	d1 = input.nextInt();
	d2 = input.nextInt();

	int min = GameMinutes(arr, stId, d1-1, d2-1);
	System.out.println("Total time played: " + min + " minutes");
	}
	
}