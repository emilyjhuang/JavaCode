public class Int{
	
	public static void main(String[] args)
	{

	int [] arr1 = {1,3,5,7};
	int [] arr2 = {2,4,6,8};


	for (int i = 0; i < arr1.length;i++)
	{
		System.out.println("Number " + (i+1) + " : "+ arr1[i] + " x " + arr2[i] + " = " + (arr1[i]*arr2[i]));
 		result += (arr1[i]*arr2[i]);
	}
	System.out.println("Total: " + result);
	}
}

