import java.util.Scanner;

public class highLowGame {
	int currGuess;
	int numGuess = 1;
	int ans;
	int low;
	int high;
	
	//returns a random number between 1 and 10
	public highLowGame(int x, int y){
		ans = random(x, y);
	}
	
	public highLowGame(){
		ans = random(1, 10);
	}
	
	public int random(int min, int max) {
		low = min;
		high = max;
		return (int) (Math.random() * (max - min) + min);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("This is a simple number game. I will think of a number and you will guess it.");
		System.out.println("What would you like the lower bound parameter to be?");
		int lower = scan.nextInt();
		System.out.println("What would you like the upper bound parameter to be?");
		int upper = scan.nextInt();
		highLowGame myGame = new highLowGame(lower,upper);
		System.out.println("I have thought of a number between " + myGame.low + " and " + myGame.high
				+ ". Your task is to guess this number.");
		System.out.println("Please input your first guess:");
		myGame.currGuess = scan.nextInt();
		if(myGame.currGuess == myGame.ans) {
			System.out.println("Congratulations! You won the game!");
			System.out.println("It only took 1 try!");
		}
		else {
		while(myGame.currGuess != myGame.ans) {
			myGame.numGuess++;
			if(myGame.currGuess > myGame.ans) {
				System.out.println("Your guess is too high!");
			}
			else {
				System.out.println("Your guess is too low!");
			}
			myGame.currGuess = scan.nextInt();
			}
		System.out.println("Congratulations! You won the game!");
		System.out.println("It only took " + myGame.numGuess + " tries!");
		scan.close();
		}
	}		
	}
