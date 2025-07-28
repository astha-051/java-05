public class queuelinkedlist{
	static class Node{
		int data;
		Node next;

		Node(int  data)
		{
			this.data=data;
			next=null;
		}
	}

		static class queue1{
			static Node head=null;
			static Node tail=null;
		

		public static boolean isEmpty()
		{
			return head==null & tail==null;
		}

		public static void add(int data){
			Node newnode=new Node(data);
			if(tail == null) //one element
			{
				tail = head = newnode;
				return;
			}
			tail.next=newnode;
			tail=newnode;
		}

		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("queue is full");
				return -1;
			}

			int front=head.data;
			if(head==tail)
			{
				tail=null;
			}
			head=head.next;
			return front;

		}

		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("empty queue");
				return -1;
			}

			return head.data;
		}
	}
	public static void main(String[]args)
	{
		queue1 q=new queue1();

		for(int i=0;i<5;i++)
		{
			q.add(i);
		}

		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}