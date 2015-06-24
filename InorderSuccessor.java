/* Inoder successor without parent link */

package trees;

import java.util.Scanner;

public class InorderSuccessor {
	
	static TNode root;

	public void addNode(int key)
	{

		TNode newNode = new TNode(key);
		if (root == null) 
		{
			root = newNode;
		} else {
			TNode focusNode = root;
			TNode parent;

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
	
	public TNode findNode(int key)
	{
	
		while(root.key!= key)
		{
			
			if(root.key > key )
			{
				root = root.leftChild;
			}
			else
			{
				root = root.rightChild;
			}
			if(root == null)
				return null;
		}
		return root;
	}

	public TNode getSuccessor(TNode root, int key)
	{
		
		TNode current = findNode(key);
		
		if(current == null)
		{
			return null;
		}
		if(current.rightChild != null)
		{
			TNode s = current.rightChild;
			while(s.leftChild != null)
			{
				s = s.leftChild;
			}
			
			return s;
		}
		else
		{
			TNode Successor = null;
			TNode ancestor = root;
			while(ancestor != current)
			{
				if(current.key < ancestor.key)
				{
					Successor = ancestor;
					ancestor = ancestor.leftChild;
				}
				else
					{
					ancestor = ancestor.rightChild;
					}
			}
			
			return Successor;
		}
	} 
	
	public void inOrderTraverseTree(TNode focusNode) {

		if (focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			System.out.print( focusNode.key + " ");
			inOrderTraverseTree(focusNode.rightChild);

		}
		
	}
	
	
	
	public static void main(String[] args) {

		InorderSuccessor theTree = new InorderSuccessor();
		
		int[] arr = {50,20,30,40,70,60,80};
		for(int s : arr)
			
		{
			theTree.addNode(s);
		}
		
		theTree.inOrderTraverseTree(theTree.root);
		Scanner s = new Scanner(System.in);
		System.out.println("\n Enter the key for which inorder successor to be found");
		int key = s.nextInt();
		TNode inordersuc = theTree.getSuccessor(root,key);
		
			if(inordersuc == null)
				{
				System.out.println("No Inorder succesor");
				}
			else
			{
				System.out.println("The inorder successor is " +inordersuc.key);
			}
		

}

}

class TNode
{
	int key;
	TNode leftChild;
	TNode rightChild;

public TNode(int key)
	{
		this.key = key;
		leftChild = null;
		rightChild = null;
	}
}
