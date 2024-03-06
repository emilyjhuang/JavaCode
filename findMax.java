public class findMax
{

	public static int findMax(int a, int b, int c)
	{
		
		if (a > b)
		{
			if (b>c)
				return a;
			else
			{
				if (a>c)
					return a;
				else
					return c;

			}
			
		}
		else
		{
			if (b>c)
				return b;
			else
				return c;
		}
	}
	public static void main(String[] args)
	{
		int max = findMax(4, 6,2);
		System.out.print("The max of 4, 6, and 2 is: " + max);

	}
}

