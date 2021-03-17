import java.util.Random;
import java.util.Scanner;

public class DiceGameProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner g = new Scanner(System.in);

		int dice;
		int userDice;
		int games;
		int userWins = 0;
		int computerWins = 0;
		int draw = 0;
		int rounds = 10;

		System.out.println("We're about to play a game hwere you and the computer goes into a random game of dice."
				+ "how many games will you like to play? you can only play up to 10 ");

		for (int turns = 1; turns <= rounds; turns++) {
			dice = random.nextInt(6) + 1;
			userDice = random.nextInt(6) + 1;

			if (userDice > dice) {
				userWins++;
				System.out.println("the user won round " + turns + "\nUserWins: " + userWins + "\nComputerWins: " + computerWins );
			} else if (dice > userDice) {
				computerWins++;
				System.out.println("the Computer won round " + turns + "\nUserWins: " + userWins + "\nComputerWins: " + computerWins );
			} else if(dice == userDice) {
				System.out.println("this round was a draw " + turns + "\nUserWins: " + userWins + "\nComputerWins: " + computerWins );
				draw++;
			}
		}

		if (userWins > computerWins) {
			System.out.println("the user won with a total of " + userWins);
		} else if (computerWins > userWins) {
			System.out.println("The computer won with a total of " + computerWins);
		} else if (computerWins == userWins) {
			System.out.println("It's a draw");
		}

		/*
		 * while (!g.hasNextInt() ) { System.out.println("Please try again"); g.next();
		 * } games = g.nextInt();
		 * 
		 * if (games > 10 || games < 1) {
		 * System.out.println("Entered an incorrect amount of games, please try again");
		 * }
		 */

	}

}
