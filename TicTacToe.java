import java.util.Scanner;

public class TicTacToe {
	public TicTacToe(int x, int y) {
		
	}
	
	public static void main(String[] args) {
		int col;
		int row;
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 1, you are using Xs. Player 2, you are using Os.");
		System.out.println("Player 1, what is your move? \n Input the column:");
		col = scan.nextInt();
		System.out.println("Input the row:");
		row = scan.nextInt();
		TicTacToe t = new TicTacToe(row,col);
		scan.close();
	}
}