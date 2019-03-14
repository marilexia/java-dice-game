import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int initialPosition = 0;
		int totalRoll = 0;
		
		System.out.println("Welcome to the Dice Game! You are now at position 0.");
		for( ; initialPosition <= 100 ; ) {
			System.out.println("What do you want to do?");
			System.out.println("Type 0 to exit, 1 to move a space, 2 to roll dice");
			Scanner userInput = new Scanner(System.in);
				int num = userInput.nextInt();
		if(num == 0) {
			System.out.println("* End of Game *");
			System.exit(0);
		}
		if(num == 1) {
			initialPosition++;
			System.out.println("You moved [1] space");
			System.out.println("Current Position: [" + initialPosition + "]");	
		}
		if(num == 2) {
			int die1 = Utils.roll(1);
			System.out.println("The first die is [" + die1 + "]");
			int die2 = Utils.roll(2);
			System.out.println("The second die is [" + die2 + "]");
			 totalRoll = die1 + die2;
			initialPosition = initialPosition + totalRoll;
			System.out.println("Total Rolls: [" + totalRoll + "]");
			System.out.println("");
			System.out.println( "Current Position: [" + initialPosition + "]" );	
		}
		if (num > 2) {
			System.out.println("Incorrect Input. Please try again.");
		}
		initialPosition  = Utils.move(initialPosition, totalRoll);
		System.out.println("Applying the special rules, ");
		System.out.println("your Final Position is: [" + initialPosition + "]");
		}
	}

}
