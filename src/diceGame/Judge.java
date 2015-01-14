package diceGame;

public class Judge{

	int gameCount;
	int round=0;
	Player playerA = new Player();
	Player playerB = new Player();
	Dice dice = new Dice();
	
	public void addName() {
		
	}
	
	public void addSum() {
		
		
	}
	
	public int score, score2;
	
	public void playgame() {
		
		if(playerA.sum < playerB.sum) {
			score = dice.hardRoll();
			playerA.state = "[HARD]";
		}
		else if(playerA.sum > playerB.sum+6) {
			score = dice.easyRoll();
			playerA.state = "[EASY]";
		}
		else {
		score = dice.normalRoll();
		}
		playerA.addScore(score);
		
		score2 = dice.normalRoll();
		
		playerB.addScore(score2);
		
	}
	
	public void changeState(Player playerA, Player playerB) {
		
		playerA.state = "[NORMAL]";
		
		if(playerA.sum < playerB.sum) {
			playerA.state = "[HARD]";
		}
		if(playerA.sum > playerB.sum+6) {
			playerA.state = "[EASY]";
		}
		
	}

	public String judgeWinner() {
		
		String winner;
		
		if(playerA.sum > playerB.sum){
			winner = playerA.name;
		} else
			winner = playerB.name;
		
		return winner;
	}
	
	public void playPrint(Player playerA, Player playerB) {
		System.out.print(playerA.name + ":" + playerA.sum + playerA.state);
		System.out.println("	"+playerB.name + ":"+ playerB.sum);
	}
	
	public void endMessage() {
		System.out.println("승자를 기록합니다.");
	}
	
	public void resultMessage(String name) {
		System.out.println(name+" 승리했습니다!");
	}


}
