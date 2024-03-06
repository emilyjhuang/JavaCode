package review;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Review {
	
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do
		{
			try
			{
				System.out.print("Enter an integer: ");
				int number = input.nextInt();
				System.out.print("The number is: " + number);
				continueInput = false;
				
			}
			catch (InputMismathException ex)
			{
				System.out.print("try again, not an integer");
				input.nextInt();
			}
		} while(continueInput);
		
	}

}
