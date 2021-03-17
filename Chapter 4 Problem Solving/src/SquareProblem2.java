import java.util.Scanner;
public class SquareProblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner side = new Scanner(System.in);
		int square;
		
		System.out.println("how many pieces are in your square ");
		square = side.nextInt();
		
		while (square < 1 || square > 15) {
			System.out.println("Please try again");
			square =side.nextInt();
		}
		
		for (int row = 1; row <= square; row++) {
			for (int column = 1; column <= square; column++) {
				System.out.print("X");
			}
			System.out.println();
		}
	}

}
