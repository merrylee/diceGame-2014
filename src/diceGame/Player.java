package diceGame;

public class Player {

	public int sum = 0;
	public String name;
	public String state, diceMode; // 사기인지아닌지

	public Player() {
	}

	public void addScore(int number) {
		sum += number;
	}

}
