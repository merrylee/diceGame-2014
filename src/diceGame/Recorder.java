package diceGame;

public class Recorder extends Judge{
	
	public void printScore(Player playerA, Player playerB) {
		System.out.print(playerA.name + ":" + playerA.sum + playerA.state);
		System.out.println("	"+playerB.name + ":"+ playerB.sum);
	}
	
	public void printEndMessage() {
		System.out.println("승자를 기록합니다.");
	}
	
	public void printResultMessage(String name) {
		System.out.println(name+" 승리했습니다!");
	}
	
}
