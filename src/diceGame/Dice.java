package diceGame;

public class Dice {

	private int diceNumber;

	public int normalRoll() {

		getNumber();
		return diceNumber;
	}

	public int easyRoll() {

		do {
			getNumber();
		} while (getNumber() >= 5);

		return diceNumber;
	}

	public int hardRoll() {

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
