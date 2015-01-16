package diceGame;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

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
	
	@Test
	public void testWinner_playerB의_총점이_높으면_승자는_B이다() {

		Judge judge = new Judge();

		judge.playerA.sum = 10;
		judge.playerA.name = "피카츄";
		judge.playerB.sum = 12;
		judge.playerB.name = "이선민";
		
		String result = judge.getWinner();

		assertEquals("이선민",result);

	}

}
