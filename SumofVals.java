import java.util.Scanner;

public class SumofVals
{

	public static boolean isEven(int number){
	return number % 2 ==0;
	}

	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);
	System.out.print("Enter Text: ");
	String numbers = input.nextLine();

	String[] numbersArr = numbers.split("-");

	int even = 0;
	int odd = 0;

	for (String numberString : numbersArr){
	int number = Integer.parseInt(numberString);
	if (isEven(number)){
		even += number;
	}
	else 
	{
		odd += number;
	}
	}
	System.out.println("Sum of even numbers: " + even);
	System.out.println("Sum of odd numbers: " + odd);

	
	


	}
}	