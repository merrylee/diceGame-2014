package diceGame;

public class Dice {

	private int diceNumber;

	public int rollNormal() {

		getNumber();
		return diceNumber;
	}

	public int rollEasy() {

		do {
			getNumber();
		} while (getNumber() >= 5);

		return diceNumber;
	}

	public int rollHard() {

		do {
			getNumber();
		} while (getNumber() <= 2);

		return diceNumber;
	}

	public int getNumber() {
		diceNumber = (int) Math.round(1 + Math.random() * 5);
		return diceNumber;
	}

}
