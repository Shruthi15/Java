/* First Non Repeating Character in the String */

package stringunique;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class FirstNonRepeating {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the String:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		char sr = firstNonRepeatChar(s1);
		System.out.println(sr);
		
	}
	
	public static char firstNonRepeatChar(String s1)
	{
		Map<Character, Integer>map = new HashMap<Character, Integer>();
	
			char[] s = s1.toCharArray();
			for(Character str : s )
				{
				
					if(map.containsKey(str))
					{
						map.put(str,map.get(str)+1);
					}
					else
					{
						map.put(str,1);
					}
			
				}
			for(int i =0; i < s1.length(); i++)
			{
				Character str = s1.charAt(i);
				if(map.get(str) == 1)
				{
					return str;
				}
			
			}
			
		return 0;
		
		
	}
}
