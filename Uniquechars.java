package stringunique;

import java.util.Scanner;

public class Uniquechars {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		str = s.nextLine();
		boolean b = checkUnique(str);
		if(b)
		{
			System.out.println("Contains all unique characters");
		}
		else
		{
			System.out.println("does not contain unique characters");
		}
		
		
	}
	
	public static boolean checkUnique(String str)
	{
		if(str.length()>128)
			return false;
		
		boolean[] character = new boolean[128];
		int value;
		for(int i =0; i < str.length();i++)
		{
			value = str.charAt(i);
			if(character[value]){
				return false;
			}
			character[value] = true;		
		}
			
return true;
}
	
}
