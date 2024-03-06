import java.util.Scanner;

public class InputOutput{

	public static void main (String[] args){

		int sideLength;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer value for the side length of a square: ");

		sideLength = in.nextInt();

		int perimeter = 4*sideLength;
		int area = sideLength*sideLength;

		System.out.println("Area of the square: " + area);
		System.out.println("Permimeter of the square: " + perimeter);


	}
}

