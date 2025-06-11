public class linkedlistscartch{

	Node head;  //assign node to head
	private int size;

	linkedlistscartch()
	{
		size=0;
	}

	public class Node{
		String data;
		Node next;  //node=next node

		Node(String data)
		{
			this.data=data;
			this.next=null;  //next = null
			size++;
		}
	}

	public void addFirst(String data)  //add first from the list
	{
		Node newnode=new Node(data);  //new node adds data
		newnode.next=head;  //first data's head=head
		head=newnode;  //data
	}

	public void addLast(String data)
	{
		Node newnode=new Node(data);

		if(head==null) //if list is empty
		{
			head=newnode;
			return;	
		}

		Node lastnode=head;  //starts from first
		while(lastnode.next != null)
		{
			lastnode=lastnode.next;  //travel the list from first to last(null)
		}

		lastnode.next=newnode;  //if list null
	}

	public void printList()
	{
		Node currentnode=head;

		while(currentnode != null)
		{
			System.out.print(currentnode.data+" ->  ");
			currentnode=currentnode.next;  //move next
		}

		System.out.println("null");
	}

	public void deleteFirst()
	{
		if(head  == null)
		{
			System.out.println("empty list");
			return;
		}

		size--;  //remove from size
		head=head.next;  //remove first link element
	}

	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("empty list");
			return;
		}

		size--;  //we can't miss if condtion so the size-- is here
		if(head.next == null)  //link list have only 1 node
		{
			head = null;
			return;
		}

		Node secondlast=head;  //second last head
		Node lastnode=head.next;  //if head.next=null -> lastnode=null

		while(lastnode.next!=null)  //last element  null!=null is giving error so that if condition
		{
			lastnode=lastnode.next;
			secondlast=secondlast.next;
		}

		secondlast.next = null;  //remove last element
	}

	public int getsize()
	{
		return size;
	}

	public void reverse()  //loop
	{
		if(head==null || head.next==null)  //head=empty head.next=1 element only
		{
			return;
		}

		Node previous=head;
		Node current=head.next;

		while(current != null)
		{
			Node next=current.next;  //next=current
			current.next=previous;  //current=previous

			//update
			previous=current;
			current=next;
		}
		head.next=null;
		head=previous;
	}

	public Node recursive(Node head)  //bcz return type is must be Node
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		Node newhead=recursive(head.next);
		head.next.next=head;  //2->3->2
		head.next=null;

		return newhead;
	}

	public static void main(String[]args)
	{
		linkedlistscartch list=new linkedlistscartch();

		list.addLast("1");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.addLast("5");
		list.printList();

		System.out.println("size="+list.getsize());
		// list.reverse();
		// list.printList();

		list.head=list.recursive(list.head);
		list.printList();
	}
}