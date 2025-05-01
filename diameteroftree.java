public class diameteroftree{

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

	public static int height(Node root)
	{
		if(root == null)
		{
			return 0;
		}

		int leftheight=height(root.left);
		int rightheight=height(root.right);

		int answer=leftheight>rightheight?leftheight:rightheight;

		return answer+1;
	}

	public static int diameter(Node root)  //approach-1
	{
		if(root == null)
		{
			return 0;
		}
		int dia1=diameter(root.left);
		int dia2=diameter(root.right);
		int dia3=height(root.left) + height(root.right) + 1;

		int ans2=(dia1>dia2 && dia1>dia3)?dia1:(dia2>dia3?dia2:dia3);

		return ans2; 
	}

	static class TreeInfo{
		int ht;
		int dia;

		TreeInfo(int ht,int dia)
		{
			this.ht=ht;
			this.dia=dia;
		}
	}

	public static TreeInfo  diameter2(Node root)  //we cannot return two values so we return whole class 
	{		
		if(root==null)
		{
			return new TreeInfo(0,0);

		}
		TreeInfo left=diameter2(root.left);
		TreeInfo right=diameter2(root.right);

		int myheight=Math.max(left.ht,right.ht)+1;  //passing height

		int diam1=left.dia;
		int diam2=right.dia;
		int diam3=left.ht+right.ht+1;

		int mydiam=Math.max((Math.max(diam1,diam2)),diam3);

		TreeInfo myinfo=new TreeInfo(myheight,mydiam);

		return myinfo;
	}                
	public static void main(String[]args)
	{
		int tree[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

		binary b=new binary();

		Node root=b.binary(tree);

		System.out.println(root.data);

		System.out.println("height="+height(root));

		System.out.println("diameter="+diameter(root));

		System.out.println("diamete2="+diameter2(root).dia);
	}
}