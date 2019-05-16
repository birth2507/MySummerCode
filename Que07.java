import java.util.*;
class BinaryTreeNode
{
	BinaryTreeNode left, right;
	int data;
	BinaryTreeNode(){
		left = null;
		right = null;
		data = 0;
	}
	BinaryTreeNode(int data){
		left = null;
		right = null;
		this.data = data;
	}
	public BinaryTreeNode getleft()
	{
		return left;
	}
	public BinaryTreeNode getright()
	{
		return right;
	}
}
class binaryTreeMethod{
	BinaryTreeNode root = null;
	public void insert(int value)
	{
		//Scanner sc = new Scanner(System.in);
		root = insertNode(root,value);
	}
	private int height(BinaryTreeNode root) {
		if(root==null)
			return 0;
		int llength = height(root.left);
		int rlength = height(root.right);
		return (llength>rlength)?llength+1:rlength+1;
	}
	public BinaryTreeNode insertNode(BinaryTreeNode node, int value)
	{
		if(node== null)
		{
			node =new BinaryTreeNode(value);
		}
		else
		{
			if(node.data<=value)
			{
				if(node.right==null)
					node.right = new BinaryTreeNode(value);
				else
					node.right = insertNode(node.right,value);
			}
			else
			{ 	
				if(node.left==null)
					node.left = new BinaryTreeNode(value);
				else
					node.left = insertNode(node.left,value);		
			}
		}
		return node;
	}
	public void printTree(){
		print(root);
	}
	public void print(BinaryTreeNode root)
	{
		if(root!=null){
			System.out.println(root.data);
			//System.out.println("/" +"       "+"");
			print(root.left);
		
		print(root.right);
		}
	}
	public boolean balancedOrNot() {
		boolean b = false;
		b = checkBalance(root);
		return b;
	}
	public boolean checkBalance(BinaryTreeNode root) {
		boolean b = false;
		if(root == null)
			return true;
		int left = height(root.left);
		int right = height(root.right);
		//System.out.println(left + "   "+ right);
		if((left-right)<=1 && checkBalance(root.left) && checkBalance(root.right)) {
			b = true;
		}
		return b;
	}
}
class Que07{
	public static void main(String[] args){
			BinaryTreeNode root1 = null;
			binaryTreeMethod t = new binaryTreeMethod();
			binaryTreeMethod t1 = new binaryTreeMethod();
		int[] arr = new int[]{
				15,13,16,11,14,9,10
				};
		/*
		 	15
		   /  \
		  13  16
		/  \
	   11  14
	  /  \
	 9  10 	
	 	 */
		
		int[] arr1 = new int[]{
					12,8,15,6,9,13,5
				};
		/*
	 	12
	   /  \
	  8    15
	/  \   /
   6  	9 13
  /  
 5
 	 */	
				for(int i=0;i<arr.length;i++)
					t.insert(arr[i]);
				for(int i=0;i<arr1.length;i++)
					root1 = t1.insertNode(root1,arr1[i]);
				//t.print(root1);
				boolean b = t.balancedOrNot();
				if(b== true)
					System.out.println("First Tree is Balanced");
				else
					System.out.println("First Tree is not Balanced");
				boolean b1 = t1.checkBalance(root1);
				if(b1== true)
					System.out.println("Second Tree is Balanced");
				else
					System.out.println("Second Tree is not Balanced");
	}
}