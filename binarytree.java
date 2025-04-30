public class binarytree{

	static class Node{
		Node right;
		Node left;
		int data;

		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}

	static class binary{
		static int index = -1;
		public static Node buildtree(int tree[])
		{
			index++;

			if(tree[index]==-1)
			{
				return null;
			}

			Node newnode=new Node(tree[index]);
			newnode.left=buildtree(tree);
			newnode.right=buildtree(tree);

			return newnode;
		}
	}
	public static void main(String[]args)
	{
		int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};  //-1=null

		binary b=new binary();

		Node root=b.buildtree(tree);

		System.out.println(root.data);  //if root is 1st element of array than it's true
	}
}