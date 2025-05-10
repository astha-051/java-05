import java.util.*;

public class apnaassiangnment1{

	public static int rosting(int [][]grid)
	{	
		int row=grid.length;
		int col=grid[0].length;

		Queue<int []> q=new LinkedList<>();
		int fresh=0;

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(grid[i][j] == 2)  //sadelu cche to add in queue
				{
					q.offer(new int[]{i,j});
				}
				else if(grid[i][j] == 1)
				{
					fresh++;
				}
			}
		}
		if(fresh == 0)
		{
			return 0;
		}

		int min=0;
		int [][]direction={{0,1},{1,0},{0,-1},{-1,0}};

		while(!q.isEmpty())
		{
			int size=q.size();
			boolean newrooton=false;

			for(int i=0;i<size;i++)
			{
				int []point=q.poll();  //sadelu santru nikalyu
				int r=point[0],c=point[1];  //eni row and col count kari

			for(int []dir: direction)
			{
				int newR=r+dir[0];
				int newC=c+dir[1];


				if(newR>=0 && newR<row && newC>=0 && newC<col && grid[newR][newC] ==1) //check in all direction for freah orange
				{
					grid[newR][newC]=2;  //if fresh orange exist than ene sadavo
					q.offer(new int[]{newR,newC});  //male to add in queue
					fresh--;
					newrooton=true;
				}
			}
		}
			if(newrooton)  //in this round kaik navu sadyu to ek min vadhare
			{
				min++;
			}

		}
		return fresh==0?min:-1;  //badha sadi gya to min otherwise -1
	}

	public static void main(String[]args)
	{
		int [][] grid={{2,1,1},{1,1,0},{0,1,1}};

		System.out.println(rosting(grid));
	}	
}