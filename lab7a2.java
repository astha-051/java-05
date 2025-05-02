import java.util.*;

class book{
	private String author_name="astha";

	void display()
	{
		System.out.println("author_name="+author_name);
	}
}

class book_publication extends book{
	private String title;

	book_publication(String title)
	{
		this.title=title;
	}

	void display()
	{
		super.display();
		System.out.println("title="+title);
	}
}

class paper_publication extends book{
	private String title;

	paper_publication(String title)
	{
		this.title=title;
	}

	void display()
	{	
		super.display();
		System.out.println("title="+title);
	}
}

public class lab7a2{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter book or paper:");
		String op=ab.nextLine();

		book b;

		if(op.equals("book"))
		{
			b=new book_publication("money");
			b.display();
		}
		else if(op.equals("paper"))
		{
			b=new paper_publication("trading");
			b.display();
		}
	}
}
