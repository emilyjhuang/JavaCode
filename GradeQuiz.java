public class GradeQuiz{
	
	public static double grade(char [] arr, char [] k)
	{
		double avg = 0;

		for (int i = 0; i < arr.length; i++)//rows
		{ 
			int correctCount = 0;
			for (int j = 0; j < arr[i].length;j ++)
			{ // col
				if (arr[i][j] == k[j])
					correctCount++;
			}
		}
			System.out.println("Student " + i + "s correct count is  " + correctCount);
			double a = ((double) correctCount / k.length);
			avg += a;
			System.out.println("Student's grade is " + a + " over 1.0");



		avg /= arr.length;
		return avg;
		

	}



	public static void main(String[] args)
	{
	char[] keys = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"}

	char [][] answer = {
	{"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
 	{"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
 	{"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
 	{"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
 	{"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
 	{"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
 	{"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
 	{"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}};
	

	System.out.println("The overall class average is lower than ")

	}


}