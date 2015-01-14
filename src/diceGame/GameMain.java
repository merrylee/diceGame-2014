package diceGame;

public class GameMain {

	public static void main(String[] args) {

		int gameCount = 5;
		int round=0;
		String nameA = "피카츄"; //사기
		String nameB = "이선민"; //일반

		Judge judge = new Judge();
		Dice dice = new Dice();
		
		judge.playerA.name = nameA;
		judge.playerB.name = nameB;
		judge.gameCount = gameCount;
		

		while(round < gameCount) {
			
			judge.changeState(judge.playerA, judge.playerB);
			judge.playgame();


			judge.playPrint(judge.playerA, judge.playerB);
			round++;
		}
		
		judge.endMessage();
		
		String winner;
		winner = judge.judgeWinner();
		judge.resultMessage(winner);
		
		
	}

}
