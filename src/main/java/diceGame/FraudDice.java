package diceGame;

public class FraudDice extends Dice {

	public int rollFraudDice(Player playerA, Player playerB) {

		int score;
		int gapNumber = 6;

		if (playerA.sum < playerB.sum) {
			score = rollHard();
		} else if (playerA.sum > playerB.sum + gapNumber) {
			score = rollEasy();
		} else {
			score = rollNormal();
		}

		return score;
	}

}
