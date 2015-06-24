/* Convert the given sortedarray to BST */ 

package Tree;

public class SortArraytobst {
	
	public static void main(String[] args)
	{
		int[] sortedarray = {20,30,40,50,60,70,80};
		SortArraytobst sort = new SortArraytobst();
		TreeNode s = sort.arraytobst(sortedarray); 
		System.out.println(" The inorder traversal of bst");
		sort.inorderDisplay(s);
	}
	
	public TreeNode arraytobst(int[] sortedarray)
	{
		return arraytobst(sortedarray, 0, sortedarray.length -1);
	}
	
	public TreeNode arraytobst(int[] sortedarray, int start, int end)
	{
		if(end < start)
			return null;
		
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(sortedarray[mid]);
		 root.Left = arraytobst(sortedarray, start, mid-1);
		root.Right = arraytobst(sortedarray, mid+1, end);
		return root;
	}
	
	public static void inorderDisplay(TreeNode root)
	{
		if(root!=null)
		{
			inorderDisplay(root.Left);
			System.out.print(root.data+" ");
			inorderDisplay(root.Right);
		}
	}
	
}
class TreeNode
{
	int data;
	TreeNode Left;
	TreeNode Right;

public TreeNode(int data)
	{
		this.data = data;
		Left = null;
		Right = null;
	}
}
