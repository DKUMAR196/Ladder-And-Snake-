import java.util.Scanner;

public class Number_of_The_Dice_Was_Played_To_Win_UC6 {
	public static final int WINNING_POSITION = 100;
	public static void main(String [] args){
		int startPosition = 0;
		int rolCounter = 0;
		System.out.print("Enter Your Name: ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.next();

        while (WINNING_POSITION > startPosition){
			int dieRoll = (int) (Math.floor(Math.random() * 10) % 6 + 1);
			rolCounter ++;
            int needToWin = WINNING_POSITION - startPosition;
			int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
			if (needToWin >=dieRoll){
				switch (checkOption) {
					case 0:
						startPosition += 0;
						break;
					case 1:
						startPosition += dieRoll;
						break;
					default:
						startPosition -= dieRoll;
						if (startPosition < 0){
							System.out.println("Start Again");
							startPosition = 0;
						}
				}
			}
			System.out.println("Player Current Position :"+startPosition);
		}
		System.out.println("Player "+playerName+ " Reached The Winning Position :"+startPosition);
		System.out.println("Dice Rolled to Win :"+rolCounter+" Times");
	}

}
