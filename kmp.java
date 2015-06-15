
/* String Mathing Pattern - KMP Algorithm */

package stringunique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class kmp {

	public static void main(String[] args)throws IOException
		{
			// TODO Auto-generated method stub
			
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("Enter the string1: ");
			String str1 = br.readLine();
			System.out.println("Enter the string2: ");
			String str2 = br.readLine();
			position(str1,str2);
		}
	
	public static int[] patternSearch(String str2)
	{
		char[] s2 = str2.toCharArray();
		int[] prefix = new int[s2.length];
		int i=0;
		prefix[0] = 0;
	
		for(int j =1 ; j < s2.length; j++)
		{
			while(i>0 && s2[i]!= s2[j])
				{
					i = prefix[i];
				}
			
			if(s2[i]==s2[j])
				{	
					i = i+1;
				}
			
				prefix[j] = i;
			}
		
		return prefix;
		
	}
		public static void position(String str1, String str2)
		{
			int n = str1.length();
			int m = str2.length();
			
			char[] s2 = str2.toCharArray();
			char[] s1 = str1.toCharArray();
			int[] prefix1 = patternSearch(str2);
			System.out.print("The prefix table is:");	
		for(int s =0 ; s < prefix1.length ; s++)
		{
			System.out.print(prefix1[s]+ " ");
		}
			
			int i= 0;
			for(int j = 0; j < n ; j++)
			{
				while(i>0 && s2[i] != s1[j])
					{
						i = prefix1[i-1];
					}
				if(s2[i]== s1[j])
					{
						i++;
					}
				if(i == m)
				{
					System.out.println("\nThe matching index is found at position:"+ (j-m+1));
					i = prefix1[i-1];
				}
			}
		}

}
