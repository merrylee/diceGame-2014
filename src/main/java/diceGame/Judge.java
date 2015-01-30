package diceGame;

public class Judge{
	
	Player playerA;
	Player playerB;
	Dice dice;
	FraudDice fraudDice;
	
	public void playGame() {

		int score, score2;

		score = fraudDice.rollFraudDice(playerA, playerB);
		playerA.addGrade(score);

		score2 = dice.rollNormal();
		playerB.addGrade(score2);
	}

	public void changeState() {

		int gapNumber = 6;

		playerA.state = "[NORMAL]";

		if (playerA.sum < playerB.sum) {
			playerA.state = "[HARD]";
		}
		if (playerA.sum > playerB.sum + gapNumber) {
			playerA.state = "[EASY]";
		}
	}

	public String getWinner() {

		String winner;

		if (playerA.sum > playerB.sum) {
			winner = playerA.name;
		} else
			winner = playerB.name;

		return winner;
	}
	
	public void setPlayerA(Player playerA) {
		this.playerA = playerA;
	}
	
	public void setPlayerB(Player playerB) {
		this.playerB = playerB;
	}
	
	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	public void setFraudDice(FraudDice fraudDice) {
		this.fraudDice = fraudDice;
	}
}
