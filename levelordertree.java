 import java.util.*;

 public class levelordertree
{
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

	public static void level(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root);
		q.add(null);

		while(!q.isEmpty())
		{
			Node currentnode=q.remove();

			if(currentnode == null)
			{
				System.out.println();

				if(q.isEmpty())
				{
					break;
				}
				else 
				{
					q.add(null);  //for second variable's breakline
				}
			}
			else 
			{
				System.out.print(currentnode.data+" ");
				if(currentnode.left != null)
				{
					q.add(currentnode.left);
				}
				if(currentnode.right != null)
				{
					q.add(currentnode.right);
				}
			}
		}
	}

	public static void main(String[]args)
	{
		int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		binary b=new binary();

		Node root=b.binary(tree);

		System.out.println(root.data);

		level(root);
	}
}