/* Check if a given tree is height balanced. CTCI 4.1 */

package Tree;

public class HeightBalanced {

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

	

	public void inOrderTraverseTree(Node focusNode) 
	{
    if (focusNode != null) 
		{
			inOrderTraverseTree(focusNode.leftChild);
			System.out.print( focusNode.key + " ");
			inOrderTraverseTree(focusNode.rightChild);

		}
		
	}

	
public static boolean isHeight(Node root)
{
	if(checkHeight(root)== -1)
		{
		System.out.println("\n Not balanced");
		
		return false;
		}
	else
		System.out.println(" balanced");
		return true;
}

public static int checkHeight(Node root)
{
	if(root == null)
		return 0;
	
	/* Checks if left is balanced */
	int leftheight = checkHeight(root.leftChild);
	
	if(leftheight == -1)
	{
		return -1;
	}
	
	/* Checks if right is balanced */
	int rightheight = checkHeight(root.rightChild);

	if(rightheight == -1)
		{
		return -1;
		}
	
	/* Checks if the current node is balanced */
	int heightDifference = leftheight - rightheight;
	if(Math.abs(heightDifference)>1)
		{
		return -1;
		}
	else
		return Math.max(leftheight, rightheight)+1;
		
	
}
	
public static void main(String[] args) {

		HeightBalanced theTree = new HeightBalanced();
		
		int[] arr = {50,30,20,40,35,70,80};
		for(int s : arr)
			
		{
			theTree.addNode(s);
		}

		theTree.inOrderTraverseTree(theTree.root);
		
		theTree.isHeight(theTree. root);
		
	}
}

class Node {

	int key;
	Node leftChild;
	Node rightChild;

	Node(int key) 
	{
		this.key = key;
	}

}
