public class preordertraveltree{

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
		static int index=-1;

		public static Node binarytree(int tree[])
		{
			index++;

			if(tree[index]==-1)
			{
				return null;
			}
			Node newnode=new Node(tree[index]);
			newnode.left=binarytree(tree);
			newnode.right=binarytree(tree);

			return newnode;
		}
	}

	public static void travel(Node root)
	{
		if(root == null)
		{
			System.out.println("-1");
			return;
		}

		System.out.println(root.data+" ");
		travel(root.left);
		travel(root.right);
	}

	public static void main(String[]args)
	{
		int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		binary b=new binary();

		Node root=b.binarytree(tree);

		System.out.println(root.data);

		travel(root);
	}
}