/* Find the minimum element in the stack at any time in O(1) */

package stacks;

import java.util.*;

public class Minelement
{
	public static class Stacksp
	 {
		Stack<Integer> mainstack=new Stack<Integer>();
		Stack<Integer> auxilarystack=new Stack<Integer>();
		void push(int x)
		{
			mainstack.push(x);
			if(auxilarystack.isEmpty()||x<auxilarystack.peek()) 
				{
				auxilarystack.push(x);
				}
			
			System.out.println("Mainstack is :"+mainstack);
			System.out.println("Auxillarystack is :"+auxilarystack);
		}
		void pop()
		{
			if (mainstack.pop().equals(auxilarystack.peek())) 
			{	
				auxilarystack.pop();
				mainstack.pop();
				System.out.println("Mainstack is :"+mainstack);
				System.out.println("Auxillarystack is :"+auxilarystack);
			}
			else
				mainstack.pop();
			System.out.println("Mainstack is :"+mainstack);
			System.out.println("Auxillarystack is :"+auxilarystack);
		}
		int min()
		{
			return auxilarystack.peek();
		}
		int peek()
		{
			return mainstack.peek();
		}
		
   }
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Stacksp s=new Stacksp();
		s.push(5);		
		s.push(9);		
		s.push(3);		
		s.push(-8);		
		s.push(7);	
		s.push(20);		
		s.push(2); 
		s.pop();
		s.pop();
		s.pop();
		s.push(1);
		System.out.println("mimimum element is: "+s.min());
		
	}
}
