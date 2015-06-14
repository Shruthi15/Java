/* Reversing the words i the string */

package stringunique;

import java.util.Scanner;

public class Reversestring 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The string to be reversed :");
		String s1 = s.nextLine();
		reverseWords(s1);
	}
	public static void reverseWords(String s1)
	{
		if((s1 == null) || (s1.length() == 0))
		{
			return;
		}
		
		String[] str = s1.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = str.length-1 ; i>=0; i--)
		{
			sb.append(str[i]);
			sb.append(" ");
		}
		System.out.println("The original string is :"+s1);
		System.out.println("The reversed string is :"+sb.toString());
	}
}
	
