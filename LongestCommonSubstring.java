package stringunique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestCommonSubstring {

	public int  lcs(String str1, String str2)
    {
        int l1 = str1.length();
        int l2 = str2.length();
 
        int[][] arr = new int[l1 + 1][l2 + 1];
        int max = 0;
 
        for (int i = 1; i < l1 + 1; i++)
        {
            for (int j = 1; j < l2 + 1; j++)
            {
                if (str1.charAt(i - 1) == str2.charAt(j - 1))
                {
                        arr[i][j] = arr[i - 1][j - 1] + 1;
                        if (arr[i][j] > max)
                        {
                            max = arr[i][j];
                            
                        }               
                }
                else
                    arr[i][j] = 0;
            }
        }        
 
        return max;
    }
 
    public static void main(String[] args) throws IOException
    {    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 
        System.out.println("\nEnter string 1");
        String str1 = br.readLine();
 
        System.out.println("\nEnter string 2");
        String str2 = br.readLine();
 
        LongestCommonSubstring lcs = new LongestCommonSubstring(); 
        int result = lcs.lcs(str1, str2);
 
        System.out.println("\n Length of Longest Common Substring : "+ result);
    }
}
