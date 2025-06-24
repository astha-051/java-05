import java.util.*;

public class nqueens{

	public boolean isSafe(int row,int col,char[][] board)
	{
		//horizontal
		for(int j=0;j<board.length;j++)
		{
			if(board[row][j] == 'Q')
			{
				return false;  //we can't place queen
			}
		}

		//verticle
		for(int i=0;i<board.length;i++)
		{
			if(board[i][col] == 'Q')
			{
				return false;
			}
		}

		//upper left
		// int r=row-1;  //for (for loop)
		for(int c=col-1,r=row-1;c>=0 && r>=0 ; r--,c--)
		{
			if(board[r][c] == 'Q')
			{
				return false;
			}
		}

		//upper right
		// r=row-1;
		for(int c=col+1,r=row-1;c<board.length && r>=0; r--,c++)
		{
			if(board[r][c] == 'Q')
			{
				return false;
			}
		}

		//lower left
		// r=row+1;
		for(int c=col-1,r=row+1;c>=0 && r<board.length;c--,r++)
		{
			if(board[r][c] == 'Q')
			{
				return false;
			}
		}

		//lower right
		// r=row+1;
		for(int c=col+1,r=row+1;c<board.length && r<board.length; r++,c++)
		{
			if(board[r][c] == 'Q')
			{
				return  false;
			}
		}
		return true; //if queen is safe
	}

	public void saveBoard(char[][] board,List<List<String>> allBoards)
	{
		String row="";

		List<String> newBOard=new ArrayList<>();

		for(int i=0;i<board.length;i++)
		{
			row="";

			for(int j=0;j<board[0].length;j++)
			{
				if(board[i][j] == 'Q')
				{
					row+='Q';
				}
				else 
				{
					row+='-';
				}	
			}
			newBOard.add(row);
		}
		allBoards.add(newBOard);
	}


	public void helper(char[][] board,List<List<String>> allBoards,int col)
	{
		if(col==board.length)
		{
			saveBoard(board,allBoards);
			return;
		}

		for(int row=0;row<board.length;row++)
		{
			if(isSafe(row,col,board))
			{
				board[row][col]='Q';  //adding queen

				helper(board,allBoards,col+1);

				board[row][col]='-';  //if condition false than remove
			}
		}
	}


	public List<List<String>> solve(int n)
	{
		List<List<String>> allBoards=new ArrayList<>(); //for output

		char[][] board=new char[n][n];  //chessboard

		helper(board,allBoards,0);  //col=0
		return allBoards;
	}

	public static void main(String[]args)
	{
		int n=4;
		nqueens n1=new nqueens();

		List<List<String>> s=n1.solve(n);
		for(List<String> board:s)
		{
			for(String row:board)
			{
				System.out.println(row);
			}
			System.out.println();
		}
		
	}
}