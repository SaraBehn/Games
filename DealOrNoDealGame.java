//UNFINISHED
//A Java version of the popular game show "Deal or No Deal"
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DealOrNoDealGame {
	int playersCase;
	ArrayList<Double> cases;
	Double[] myCases = new Double[26];
	int casesLeft;
	int currOffer;
	
	public DealOrNoDealGame(int n) {
		playersCase = n;
		cases = createCases();
		Collections.shuffle(cases);
		for(int i = 0; i < 26; i++) {
			myCases[i] = cases.get(i);
		}
		casesLeft = 26;
		currOffer = 0;
	}
	
	public Double getOffer() {
		double sum = 0;
		for(Double c: myCases) {
			sum = sum + c * (1/(casesLeft));
		}
		return sum;
	}
	
	public String toString() {
		String ret = "";
		for(int i = 0; i < 26; i++) {
			if(myCases[i] != null)
				ret = ret + (i+1) + ", ";
		}
		ret = ret.substring(0, ret.length()-1);
		return ret;
	}
	public String openCase(int caseNum) {
		
	}
	
	public ArrayList<Double> createCases() {
		ArrayList<Double> ret = new ArrayList<Double>();
		ret.add(.01);
		ret.add(1.0); 
		ret.add(5.0);
		ret.add(10.0); 
		ret.add(25.0);
		ret.add(50.0); 
		ret.add(75.0); 
		ret.add(100.0);
		ret.add(200.0);
		ret.add(300.0);
		ret.add(400.0);
		ret.add(500.0);
		ret.add(750.0);
		ret.add(1000.0);
		ret.add(5000.0);
		ret.add(10000.0);
		ret.add(20000.0);
		ret.add(50000.0);
		ret.add(75000.0);
		ret.add(100000.0);
		ret.add(200000.0);
		ret.add(300000.0);
		ret.add(400000.0);
		ret.add(500000.0);
		ret.add(750000.0);
		ret.add(1000000.0);
		return ret;
	}
	
	
	public static void main(String args[]) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Are you ready to play DEAL OR NO DEAL??");
		System.out.print("To start, pick your case:");
		DealOrNoDealGame myGame = new DealOrNoDealGame(scan.nextInt());
		System.out.print("Now, pick 6 cases to open:");
		for(int i = 0; i < 6; i++) {
			int thisCase = scan.nextInt();
			myGame.openCase(thisCase);
			System.out.print("This case contained..." + myGame.myCases[thisCase]);
			System.out.print("Pick a new case: " + myGame.toString());
		}
		System.out.print("The banker is thinking...");
		System.out.print("The banker's offer is... " + myGame.getOffer());
		System.out.print("So now I have to ask you... DEAL or NO DEAL?");
		String answer = scan.next().toLowerCase();
		while(!answer.equals("deal") ||
				!answer.equals("no deal")) {
			System.out.print("DEAL or NO DEAL?");
			answer = scan.next().toLowerCase();
		}
		if(answer.equals("deal")) {
			System.out.print("Congradulations!! You won " + myGame.getOffer() + " dollars!! See you next time on DEAL or NO DEAL");
			System.exit(0);
		}
		
			
		
	}
}
