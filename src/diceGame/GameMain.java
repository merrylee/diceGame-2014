package diceGame;

public class GameMain {

	public static void main(String[] args) {

		int gameCount = 5;
		int round = 0;
		String winner;
		
		Judge judge = new Judge();
		Recorder recorder = new Recorder();

		judge.playerA.name = "피카츄";
		judge.playerB.name = "이선민";

		while (round < gameCount) {

			judge.changeState(judge.playerA, judge.playerB);
			judge.playGame();

			recorder.printScore(judge.playerA, judge.playerB);
			
			round++;
		}

		recorder.printEndMessage();

		winner = judge.getWinner();
		recorder.printResultMessage(winner);

	}
	
}
