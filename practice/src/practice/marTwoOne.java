package practice;

public class marTwoOne {

	public static void main(String[] args) {
		
		calculateScore(true, 800, 5, 100);
		
		calculateScore(true, 10000, 8, 200);
		
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition);
		
		
		highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Bob", highScorePosition);
		
		
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Percy", highScorePosition);
		
		
		highScorePosition = calculateHighScorePosition(100);
		displayHighScorePosition("Gilbert", highScorePosition);
		
		
		highScorePosition = calculateHighScorePosition(25);
		displayHighScorePosition("James", highScorePosition);
		
	}
	
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		
		int finalScore = score;
		
		if (gameOver) {
			finalScore += (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("Your final score was " + finalScore);
		}
		
	}
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score list.");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		
		int position = 4;
		if (playerScore >= 1000) {
			position = 1;
		}
		else if (playerScore >= 500) {
			position = 2;
		}
		else if (playerScore >= 100) {
			position = 3;
		}
		
		return position;
	}
	
	

}

