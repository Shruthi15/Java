package insertionsort;

public class InsertSort {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] A = {31,41,59,26,41,58};
		System.out.println("The array is");
		printArray(A);
		insertionSorting(A);
		
	}

	private static void printArray(int[] a) 
	{
		// TODO Auto-generated method stub
		for(int i =0 ; i < a.length ; i++)
		{
			System.out.print(a[i] +" ");
		}
		
		System.out.println("\n");
	}

	private static void insertionSorting(int[] a)
	{
		// TODO Auto-generated method stub
		
		int n = a.length;
		for(int j = 1; j < n ; j++ )
		{
			
			int key = a[j];
			int i = j -1;
			while(i >= 0 && a[i] > key)
			{
				a[i+1] = a[i];
				i =i-1;
			}
			
			a[i+1] = key;
			
		}
		
		System.out.println("The sorted array is");
		printArray(a);
		
		
		
	}

}
