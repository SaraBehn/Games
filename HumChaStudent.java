import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HumChaStudent {
	String ans;
	String myGen;
	String myHair;
	String myDorm;
	/*HashSet<String> focus = new HashSet<>(Arrays.asList("Max Beck", "Sara Behn", "Lauren Berman", 
			"Ahmed Birik", "Autumn Burton", "Caitlin Carter",
			"Greta Chen", "Josh Coopersmith", "Isabella DeCarlo",
			"Sarah Derris", "Aly Diaz", "Gabe Goldhagen", "Joe Haston",
			"Jordan Hepburn", "Darien Herndon", "Eva Hong", "Kendall Jefferys",
			"Jared Junkin", "Janette Levin", "Ryan McMutry", "Sam Miezio",
			"Destiny Mulero", "Yash Patil",  "Maria Pita", "Sannan Saleh",
			"Omo Sanusi", "Kaya Scheman", "Leah Schwartz", "Heeya Sen", 
			"Jia Jia Shen", "Andy Taquechel", "Kathleen Vern", "Amy Zhao"));
	*/
	
	
	
	public HumChaStudent(String gender, String hairColor, String dorm){
		myGen = gender.toLowerCase();
		myHair = hairColor.toLowerCase();
		myDorm = dorm.toLowerCase();
	}
	
	
	/*public static void main(String[] args) {
		HumChaStudent my = new HumChaStudent();
		Scanner scan = new Scanner(System.in);
		System.out.println("Is this person male?");
		my.ans = scan.nextLine().toLowerCase();
		if(ans == "yes")
		{
			my.focus.remove(males);
		}
		scan.close();
	}*/
		
}
