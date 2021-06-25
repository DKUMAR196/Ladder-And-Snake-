import java.util.Scanner;

public class No_Play_Ladder_Or_Snake_UC3 {
	public static void main(String[] args) {
		int Start_Position = 0;
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		String Player_Name = sc.next();
		
		int Die_Roll = (int) (Math.floor(Math.random() * 10) % 6 +1);
		System.out.println("Dice Roll number :" + Die_Roll);
		
		int checkOption = (int) (Math.floor(Math.random() * 10) % 3);
		switch (checkOption) {
		        case 0:
		        	System.out.println("No Play");
		        	Start_Position += 0;
		        	break;
		        	
		        case 1:
		        	System.out.println("Ladder");
		        	Start_Position += Die_Roll;
		        	break;
		        	
		        default:
		        	System.out.println("Snake");
		        	Start_Position -= Die_Roll;
		        	
		        	if (Start_Position < 0)
		        		Start_Position = 0;
		}
		System.out.println("Player " + Player_Name + 
				"On Position :" + Start_Position);

	}

}
