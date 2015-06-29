/* Length longest palindromic subsequnce - Dynamic Programming */ 

package stringunique;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LongestPalindromeSubsequence {
		
	public int  lcs(String str1)
	    {
	        int l1 = str1.length();
	    
	        int[][] arr = new int[l1][l1];
	       
	        for(int i = 0; i < l1; i++)
	        {
	        	arr[i][i] = 1;
	        }
	         // s is the length of the substring 
	        for (int s = 2; s <= l1; s++)
	        {
	            for (int i = 0; i < l1-s+1; i++)
	            {
	                int j = i+s-1;
	                
	            	if (str1.charAt(i) == str1.charAt(j) && s == 2)
	            	{
	            		arr[i][j] = 2;
	            	}
	            	
	            	else if(str1.charAt(i) == str1.charAt(j))
	            	{
	            		arr[i][j] = arr[i + 1][j - 1] + 2;
	            	}
	            	
	            	else
	            	{
	            	arr[i][j] = Math.max(arr[i][j-1],arr[i+	1][j]);
	            	}
	            }
	        }        
	 
	        return arr[0][l1-1];
	    }
	 
	    public static void main(String[] args) throws IOException
	    {    
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	 
	 
	        System.out.println("\nEnter string: ");
	        String str1 = br.readLine();
	        LongestPalindromeSubsequence lcs = new LongestPalindromeSubsequence(); 
	        int result = lcs.lcs(str1);
	 
	        System.out.println("\n Length of Longest Palindrome Subsequence : "+ result);
	    }
	}
		
		
		
		
		
		
		
		


