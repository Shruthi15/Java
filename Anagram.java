package stringunique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter the string1: ");
		String str1 = br.readLine();
		System.out.println("Enter the string2: ");
		String str2 = br.readLine();
		if(checkAnagram(str1, str2))
		{
			System.out.println("Strings are anagram to eachother");
		}
		else
		{
			System.out.println("Strings are not anagram to eachother");
		}
			
	}

	public static boolean checkAnagram(String str1 , String str2)
	{
		if(str1!=null && str2 != null && str1.length()!= str2.length())
			return false;
		
		char[] string1 = str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		for(Character c : string1)
			{
				int index = sb.indexOf(String.valueOf(c));
				if(index == -1)
					return false;
				
				sb.delete(index, index+1);
			}
		
		return true;
	}
}
		
