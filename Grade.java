import java.util.Scanner;

public class Grade{
	public static void main(String[] args)
	{

		int score;
		char grade;
		System.out.print("enter score: ");
		Scanner scans = new Scanner(System.in);
		score = scans.nextInt();

		if (score >= 90)
			grade = 'A';
		else if(score >= 80) //else if(score) is equl to saying else if(score >80 && score <90)
			grade = 'B';
		else if(score >= 70)
			grade = 'C';
		else if(score < 60)
			grade = 'D';
		else
			grade = 'F';

		System.out.println("grade is: " + grade);

	}
}
	
	