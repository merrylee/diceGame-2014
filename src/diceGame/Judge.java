package diceGame;

public class Judge {

	Player playerA = new Player();
	Player playerB = new Player();
	Dice dice = new Dice();
	FraudDice fraudDice = new FraudDice();

	public void playGame() {

		int score, score2;

		score = fraudDice.rollFraudDice(playerA, playerB);
		playerA.addGrade(score);

		score2 = dice.rollNormal();
		playerB.addGrade(score2);
	}

	public void changeState(Player playerA, Player playerB) {

		playerA.state = "[NORMAL]";

		if (playerA.sum < playerB.sum) {
			playerA.state = "[HARD]";
		}
		if (playerA.sum > playerB.sum + 6) {
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

}
