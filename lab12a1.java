import java.io.*;

public class lab12a1{
	public static void main(String[]args)
	{
		try
		{
			FileOutputStream fout=new FileOutputStream("abc.txt");//for write in file
			String s="hey i am astha";
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();

			System.out.println("file completed");

			BufferedReader bf=new BufferedReader(new FileReader("abc.txt"));//for read file

			String line="";
			int ch=0;
			int word=0;
			int LineNO=0;

			while((line=bf.readLine())!=null)  //method of buffered class
			{
				LineNO++;
				String[] words=line.split(" ");  //get words from space 
				word+=words.length;  //count words from length

				for(int i=0;i<words.length;i++)
				{
					ch+=words[i].length(); //gives char one by one
				}
			}

			bf.close();
			System.out.println("words="+word);
			System.out.println("lines="+LineNO);
			System.out.println("char="+ch);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}