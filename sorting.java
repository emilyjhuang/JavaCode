public class sorting
{

	public static void SelectionSort(int[] arr)
	{
		for(int i = 0; i < arr.length -1; i++)
	{
		int min = arr[i];
		int minIndex = i;

		for (int k = i+1; k < arr.length; k++)
		{
			if (arr[k] < min)
			{
				min = arr[k];
				minIndex = k;
			}
		}

		if (minIndex != i)
		{
			arr[minIndex] = arr[i];
			arr[i] = min;
		}
	}
	}

	public static void printArray(int [] arr) 
	{
		System.out.print("{");
		for (int i = 0; i < arr.length-1; i++)
			System.out.print(arr[i] + " , ");
		System.out.print(arr[arr.length-1]);
		System.out.print("}");
		System.out.println(" ");

	}

	public static void main(String[] args)
	{
		int [] arr = {45, 23, 89, 12, 67, 108, 112, 101, 11, 5, 44, 54};
		SelectionSort(arr);
		printArray(arr);

	}

		
}
