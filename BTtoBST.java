/* Check if BT is a BST - Input using add() */
package trees;

public class BTtoBST {
	
	
	Node root;

	public void addNode(int key)
	{

		Node newNode = new Node(key);
		if (root == null) 
		{
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {

				focusNode = focusNode.leftChild;
				if (focusNode == null) 
				{
					parent.leftChild = newNode;
						return;
				}

				} else
				{ 

					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return; 

					}

				}

			}
		}

	}

	public void inOrderTraverseTree(Node focusNode) {

		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.print( focusNode.key + " ");
			inOrderTraverseTree(focusNode.rightChild);

		}
		
	}
	
	public boolean checkBST(Node root)
	{
		return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public boolean checkBST(Node root, int min, int max)
	{
		
		
		if(root == null)
			return true;
		
		if(root.key < min || root.key >max)
				{	
				return false;
		
				}
		if(!checkBST(root.leftChild, min, root.key)||
			!checkBST(root.rightChild,root.key, max))
				{	
			return false;
				}
		else
		{
			return true;
		}
		
		
	}
	public static void main(String[] args) {

		BTtoBST theTree = new BTtoBST();
		
		int[] arr = {5,10 ,15 ,40, 20, 25, 30, 35};
		for(int s : arr)
			
		{
			theTree.addNode(s);
		}

		theTree.inOrderTraverseTree(theTree.root);
		
		if(theTree.checkBST(theTree.root))
			
		{
			System.out.println("\n Tree is a BST");
		}
		
		else
			
			System.out.println("\n Tree is not a BST");
	}
}
	class Node
	{
		int key;
		Node leftChild;
		Node rightChild;

	public Node(int key)
		{
			this.key = key;
			leftChild = null;
			rightChild = null;
		}
	}


