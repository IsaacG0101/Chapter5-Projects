import javax.swing.JOptionPane;
import java.util.Random;
public class EPSProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int colorIndex;
		String computerGeneratedColor = null;
		String userGuessedColor;
		int userCorrectGuesses = 0;
		int numberOfQuestions = 10;
		
		for (int questionNumber =1; questionNumber <= numberOfQuestions; questionNumber++) {
			colorIndex = random.nextInt(5);
		switch (colorIndex) {
		case 0:
			computerGeneratedColor = "Red";
			break;
			
		case 1:
			computerGeneratedColor = "Blue";
			break;
			
		case 2:
			computerGeneratedColor = "Green";
			break;
			
		case 3:
			computerGeneratedColor = "Orange";
			break;
			
		case 4:
			computerGeneratedColor = "Yellow";
			break;
			
			default: 
				JOptionPane.showMessageDialog(null, "The number " + colorIndex + " is not matched with a color");
		}
		userGuessedColor = JOptionPane.showInputDialog("I have generated a color number" + questionNumber + "( Red Green Blue Orange Yellow ). Guess what it is ");
		
		if(userGuessedColor.equalsIgnoreCase(computerGeneratedColor)) {
			userCorrectGuesses ++;
		}
		JOptionPane.showMessageDialog(null, "I selected " + computerGeneratedColor + " and you selected " + userGuessedColor);
	}
		JOptionPane.showMessageDialog(null, "You guessed correctly " + userCorrectGuesses + " of the colors i chose good job ");
		
		System.exit(0);
	}
}
