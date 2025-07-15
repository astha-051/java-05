public class postordertraveltree{
	static class Node{
		Node left;
		Node right;
		int data;

		Node(int data)
		{
			this.data=data;
			this.right=null;
			this.left=null;
		}
	}

	static class binary{
		static int index=-1;

		public static Node binary(int tree[])
		{
			index++;

			if(tree[index]== -1)
			{
				return  null;
			}

			Node newnode=new Node(tree[index]);
			newnode.left=binary(tree);
			newnode.right=binary(tree);

			return newnode;
		}
	}

	public static void postorder(Node root)
	{
		if(root==null)
		{
			return;
		}

		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[]args)
	{
		int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		binary b=new binary();

		Node root=b.binary(tree);

		System.out.println(root.data);

		postorder(root);
	}
}