package diceGame;

public class Dice {

	private int diceNumber;

	public int rollNormal() {

		getNumber();
		return diceNumber;
	}

	public int rollEasy() {

		int maxNumber = 5;

		do {
			getNumber();
		} while (getNumber() >= maxNumber);

		return diceNumber;
	}

	public int rollHard() {

		int minNumber = 2;

		do {
			getNumber();
		} while (getNumber() <= minNumber);

		return diceNumber;
	}

	public int getNumber() {
		diceNumber = (int) Math.round(1 + Math.random() * 5);
		return diceNumber;
	}

}
