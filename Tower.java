/* Tower of Hanoi */

package stacks;
import java.util.*;
public class Tower 
{
	
	private Stack<Integer>disks;
	private int index;
	public Tower(int i)
	{
		disks = new Stack<Integer>();
		index = i;
	}
	
	public void movedisks(int n, Tower dest, Tower buffer)
	{
		if(n >0)
		{
			movedisks(n-1, buffer, dest);
			movetop(dest);
			buffer.movedisks(n-1, dest, this);
		}
	}
	
	public void movetop(Tower dest)
	{
		int top = disks.pop();
		dest.add(top);
		System.out.println("Disks Moved " +top+ "from "+index()+ "to "+ dest.index());
	}
	
	public void add(int d)
	{
		if(!disks.isEmpty() && disks.peek() <=d)
			System.out.println("Error  occured cannot move");
		else
			disks.push(d);
	}
	
	public int index()
	{
		return index;
	}
@SuppressWarnings("resource")
  public static void main(String[] args)
    {
	  int n;
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter the number of disks: ");
	  n = s.nextInt();
	  Tower[] towers = new Tower[n];
	  for(int i=0; i < n; i++)
	  {
		  towers[i] = new Tower(i);
  	}
	
	  for(int i = n-1; i >= 0; i--)
	  {
		  towers[0].add(i);
	  }
	`towers[0].movedisks(n,towers[2], towers[1]);
  }
	
}
