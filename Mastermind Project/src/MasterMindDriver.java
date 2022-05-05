import java.util.Scanner;
public class MasterMindDriver {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Mastermind. You will have 8 rounds to guess the masters code!");
		System.out.println("Each round, pick 4 of the following 6 colors:");
		System.out.println("red, blue, green, yellow, orange, and brown");
		System.out.println("X means you put the color in the right spot.");
		System.out.println("O means you picked a color somwhere in the code.");
		System.out.println("");
		
		String[] colorWheel = {"red", "blue", "green", "yellow", "orange", "brown"};
		String[] computerChoice = new String[4];
		for (int x=0; x<computerChoice.length; x++) {
			computerChoice[x] = colorWheel[(int) (Math.random()*6)];
		}
		
		String[] playerChoice = new String[4];
		Scanner scanStr = new Scanner (System.in);
		
		for (int l = 0; l<8; l++) {
			System.out.println("Round " + (l+1) + "!");
		for (int x=0; x<playerChoice.length; x++) {
			System.out.println("Enter a color:");
			playerChoice[x]= scanStr.nextLine();
		}
		int oRoundResult = CheckResult.getNumO(computerChoice, playerChoice);
		int xRoundResult = CheckResult.getNumX(computerChoice, playerChoice);
		
		
		for (int z=0; z<xRoundResult; z++){
			 System.out.print("X");
		}
		
		for (int y=0; y<oRoundResult; y++){
			 System.out.print("O");
			 }
		
		if (xRoundResult == 4){
			 l = 8;
			 System.out.println("");
			 System.out.println("Congrats, you win!");
		}
		System.out.println("");
		if (l==7 && xRoundResult != 4) {
			System.out.println("You lose!");
			System.out.println("The actual code was:");
			System.out.println(computerChoice[0]);
			System.out.println(computerChoice[1]);
			System.out.println(computerChoice[2]);
			System.out.println(computerChoice[3]);
		}
		}
	}
}
