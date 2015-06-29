/* Find the Maximum Sum Subarray - Dynamic Programming - Contiguous manner - If nth element is greater than sum of n-1, 
then ignore n-1 elements */

package dp;

public class MaximumSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaximumSumSubarray mss = new MaximumSumSubarray();
		int[] array = {2,1,-3,1,-1,2,1,-5,4};
		int result = mss.Maximumsumsubarray(array);
		System.out.println("The Maximum sum subarray is : " +result);
	}
	
	public int Maximumsumsubarray(int[] array)
	{
		int n = array.length;
		int max = array[0];
		int[] sum = new int[n];
		sum[0] = array[0];
		
		for(int i = 1; i < n ; i++)
		{
			sum[i] = Math.max(array[i], sum[i-1]+array[i]);
			max = Math.max(max, sum[i]);
		}
		return max;
	}

}
