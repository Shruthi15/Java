/* Inorder Successor with parent link */

package trees;

import java.util.Scanner;
public class InordersuccesorParent {
	

		
		static SNode root;

		
		public SNode findNode(SNode root,int key)
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

		public SNode getSuccessor(SNode root, int key)
		{
		
			SNode current = findNode(root,key);
			
			
			if(current == null)
			{
				return null;
			}
			if(current.rightChild != null)
			{
				SNode s = current.rightChild;
				while(s.leftChild != null)
				{
					s = s.leftChild;
				}
				
				return s;
			}
			else
			{
				
				SNode parent = current.parent;
		        while(parent!=null && current==parent.rightChild)
		        {
		            current = parent;
		            parent = parent.parent;
		        }
	
		        return parent;
			}
		} 
		
		public void inOrderTraverseTree(SNode focusNode) {

			if (focusNode != null) {
				inOrderTraverseTree(focusNode.leftChild);
				System.out.print( focusNode.key + " ");
				inOrderTraverseTree(focusNode.rightChild);

			}
			
		}
		
		
		
		public static void main(String[] args) {

			InordersuccesorParent theTree = new InordersuccesorParent();
			
			SNode root = new SNode(6);
			root.leftChild = new SNode(3);
			root.rightChild = new SNode(8);
			root.leftChild.parent = root;
			root.leftChild.leftChild = new SNode(2);
			root.leftChild.rightChild = new SNode(5);
			root.leftChild.rightChild.parent = root.leftChild;
			root.rightChild.leftChild = new SNode(7);
			
			root.rightChild.rightChild = new SNode(9);
			
			theTree.inOrderTraverseTree(root);
			Scanner s = new Scanner(System.in);
			System.out.println("\n Enter the key for which inorder successor to be found");
			int key = s.nextInt();
			SNode inordersuc = theTree.getSuccessor(root,key);
			
				if(inordersuc == null)
					{
					System.out.println("No");
					}
				else
				{
					System.out.println(inordersuc.key);
				}
			

	}

	}

	class SNode
	{
		int key;
		SNode leftChild;
		SNode rightChild;
		SNode parent;

	public SNode(int key)
		{
			this.key = key;
			leftChild = null;
			rightChild = null;
			parent = null;
		}
	}


