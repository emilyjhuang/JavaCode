import java.util.Scanner;

public class arthi{
	
	public static void main(String[] args)
	{


	Scanner input = new Scanner(System.in);
	System.out.print("Enter an expression: ");

	String arthi_expre = input.nextLine();

	String numberString = arthi_expre.substring(2, arthi_expre.length()-1);

	String[] numbersArr = numberString.split(",");

	int[] numbers = new int[numbersArr.length];

	for (int i =0; i < numbersArr.length; i++){
		numbers[i] = Integer.parseInt(numbersArr[i]);

	}
	
	int result = 0;
	if (arthi_expre.startsWith("+")) {
		for (int number : numbers){
			result += number;

		}
	}
	else if (arthi_expre.startsWith("*")){
		result = 1;
		for (int number: numbers){
			result *= number;
		}
	}
	System.out.println("The result is " + result);
	}
}