package diceGame;

public class FraudDice extends Dice {

	public int rollFraudDice(Player playerA, Player playerB) {

		int score;

		if (playerA.sum < playerB.sum) {
			score = rollHard();
		} else if (playerA.sum > playerB.sum + 6) {
			score = rollEasy();
		} else {
			score = rollNormal();
		}

		return score;
	}

}
