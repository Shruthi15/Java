
/*Count the number of duplicate characters */

package stringunique;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateCount {

	private static Scanner s;

	public static void main(String[] args) 
			{
				// TODO Auto-generated method stub

				String str;
				s = new Scanner(System.in);
				System.out.println("Enter the string");
				str = s.nextLine();
				duplicateCountLetters(str);
			}
	
	public static void duplicateCountLetters(String str)
	{
		char[] givenstring = str.toCharArray();
		Map<Character, Integer>map = new HashMap <Character, Integer>();
		for(Character c: givenstring)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) 
		{
            if (entry.getValue() > 1) 
            {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
		}
	}
	
	
}
	
	
	
