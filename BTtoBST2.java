/* SET2 : Check if a BT is a BST - Input being fixed */

package trees;

public class BTtoBST2 
	{
	TreeNode root;
	public void inOrderTraverseTree(TreeNode root) 
			{
				if (root != null) 
					{
						inOrderTraverseTree(root.left);
						System.out.print( root.key + " ");
						inOrderTraverseTree(root.right);
					}
    		}
    	
    	public boolean checkBST(TreeNode root)
    		{
    			return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    		}
    	
    	public boolean checkBST(TreeNode root, int min, int max)
    		{
    			if(root == null)
    			return true;
    		
    			if(root.key < min|| root.key >max)
    				{	
    					return false;
    				}
    			if(!checkBST(root.left, min, root.key)||
    			!checkBST(root.right,root.key, max))
    				{	
    					return false;
    				}
    			else
    				{
    					return true;
    				}
    		}
    	public static void main(String[] args) 
    		{
    			BTtoBST2 theTree = new BTtoBST2();
    			TreeNode root = new TreeNode(30);
    			root.left = new TreeNode(20);
    			root.right = new TreeNode(35);
    			root.left.left = new TreeNode(15);
    			root.left.right = new TreeNode(25);
    			root.right.left = new TreeNode(40);
    			root.left.left.left = new TreeNode(5);
    			root.left.left.right = new TreeNode(10);
    			theTree.inOrderTraverseTree(root);
    			if(theTree.checkBST(root))
    				{
    					System.out.println("\n Tree is a BST");
    				}
    			else
    			
    				System.out.println("\n Tree is not a BST");
    		}
    }
    	
class TreeNode {
	int key;
	TreeNode left;
	 TreeNode right;
	 
	public TreeNode(int key) {
		this.key = key;
	}
}


