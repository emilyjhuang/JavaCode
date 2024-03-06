public class PancakeSorting
{
	public static void pancakeSort(int[] arr){
		int n = arr.length;
		for (int i = n; i > 1; --i){
			int maxIndex = findMaxIndex(arr, i);
			if (maxIndex != i-1){
				flip(arr, maxIndex);
				flip(arr, i-1);
			}
		}
	}
	private static int findMaxIndex(int[] arr, int n){
		int maxIndex = 0;
		for (int i = 0; i < n; ++i){
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	private static void flip(int[] arr, int k){
		int i = 0;
		while (i < k) {
			int temp = arr[i];
			arr[i] = arr[k];
			arr[k] = temp;
			i++;
			k--;
		}
	}

	public static void printArray(int[] arr, int n){
		for (int i = 0; i < n; ++i)
			System.out.println(arr[i]);
	}

	public static void main(String[] args){
		int[] arr = {23, 10, 20, 11, 12, 6, 7};
		System.out.println("Unsorted Array: {23, 10, 20, 11, 12, 6, 7}");
		int n = arr.length;
		pancakeSort(arr);
		System.out.println("Sorted array:");
		printArray(arr, n);
	}
}






