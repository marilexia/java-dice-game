
public class Utils {
	
		public static int roll(int rollCount) {
			rollCount = (int)(Math.random()*7);
			if(rollCount == 0) {
				rollCount++;
			}
			return rollCount;
		}
		public static int move(int initialPosition, int totalRoll) {

			if(initialPosition % 5 == 0 && !(initialPosition % 10 == 0) ) {
				initialPosition = initialPosition + 5;
			}
			else if(initialPosition % 13 == 0) {
			int two =	totalRoll * 2;
			initialPosition = initialPosition - two;
			}
			else if(initialPosition > 100) {
				initialPosition = initialPosition - 100;
			}
			else if (initialPosition % 100 == 0) {
				System.out.println("You've reached 100! * End of Game *");
				System.exit(0); 
			}
			return initialPosition;
		}

}