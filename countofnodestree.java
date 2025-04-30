public class countofnodestree{

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
	
		public static int countnodes(Node root)
		{
			if(root == null)
			{
				return 0;
			}
			int leftcount=countnodes(root.left);
			int rightcount=countnodes(root.right);

			return leftcount+rightcount+1;
		}

	public static void main(String[]args)
	{
		int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		binary b=new binary();

		Node root=b.binary(tree);

		System.out.println(root.data);

		System.out.println("total nodes="+countnodes(root));
	}
}