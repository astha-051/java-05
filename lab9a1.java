import java.util.*;

interface EventListner{
	public void perfromEvent();
}
interface MouseListner extends EventListner{
	public void mouseClicke();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}
interface KeyListner extends EventListner{
	public void keyPressed();
	public void keyReleased();
}
class Demo implements EventListner,MouseListner,KeyListner
{
	public void perfromEvent()
	{
		System.out.println("\nperfrom event");
	}
	public void mouseClicke()
	{
		System.out.println("\nmouse clicked");
	}
	public void mousePressed()
	{
		System.out.println("\nmouse  pressed");
	}
	public void mouseReleased()
	{
		System.out.println("\nmouse released");
	}
	public void mouseMoved()
	{
		System.out.println("\n mouse moved");
	}
	public void mouseDragged()
	{
		System.out.println("\nmouse dragged");
	}
	public void keyPressed()
	{
		System.out.println("\nkey pressed");
	}
	public void keyReleased()
	{
		System.out.println("\nkey released");
	}
}
public class lab9a1{
	public static void main(String[]args)
	{
		Demo d=new Demo();

		d.perfromEvent();
		d.mouseClicke();
		d.mousePressed();
		d.mouseReleased();
		d.mouseMoved();
		d.mouseDragged();
		d.keyPressed();
		d.keyReleased();
	}
}