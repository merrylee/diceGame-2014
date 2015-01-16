package diceGame;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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

	@Test
	public void testFraudDice_playerA가_지고있으면_3456사이_숫자_출력한다() {

		Player playerA = mock(Player.class);
		Player playerB = mock(Player.class);

		playerA.sum = 10;
		playerB.sum = 12;

		int result = rollFraudDice(playerA, playerB);

		assertEquals(5, result, 2);

	}

}
