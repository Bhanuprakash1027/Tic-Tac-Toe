package bhanu;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TicTacToeGame {

	public static void main(String[] args) throws Exception {
		int board[][]=new int[3][3];
		// printing the empty array/Matrix
		System.out.println("Before taking the Input:");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++)
			{
		
		System.out.print(board[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		
		// Read the data from user we use BufferReader and created anonymous class inputstream
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String m;	
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.println("Enter values to array:");
				
				m=br.readLine();
				board[i][j]=Integer.parseInt(m);
				
			}
			
		}
		System.out.println("After adding the input:");
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++)
			{
				
		
		System.out.print(board[i][j] + " ");
			}
			System.out.println(" ");
		}
		
		if(board[0][0]==(board[1][1]&board[2][2])||(board[0][0]==(board[0][1]&board[0][2]))||(board[0][0]==(board[1][0]&board[2][0])))
			System.out.println("playes one is win:" + "BetterLuck next Time 2playes:");
		else if (board[0][1]==(board[1][1]&board[2][1])||((board[1][0]==(board[1][1]&board[1][2])))) {
			System.out.println("player 2 win:" +" BetterLuck next Time 1playes:");
		}
		else
			System.out.println("match draw:");
		
		
	}

}
