/* Sort the elements in stack using one additional stack. Time complexity is O(N^2) and space is O(N) */

package stacks;

import java.util.*;

public class SortStack 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(5);
		s.push(4);
		s.push(15);
		s.push(6);
		s.push(2);
		System.out.println("Original Stack is : "+s);
		Stack<Integer> rs = sort(s);
		System.out.println("Sorted Stack is : "+rs);
		

	}

	public static Stack<Integer>sort(Stack<Integer>s)
	{
		Stack<Integer> sortedstack = new Stack<Integer>();
		while(!s.isEmpty())
		{
			int temp = s.pop();
			while(!sortedstack.isEmpty() && sortedstack.peek() >temp)
			{
				s.push(sortedstack.pop());
			}
		
			sortedstack.push(temp);
		}
		
		return sortedstack;
	
	}
}
