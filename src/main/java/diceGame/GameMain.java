package diceGame;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GameMain {

	public static void main(String[] args) {

		int gameCount = 5;
		int round = 0;
		String winner;
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Judge judge = (Judge)context.getBean("judge");
		Recorder recorder = (Recorder)context.getBean("recorder");

		judge.playerA.name = "피카츄";
		judge.playerB.name = "이선민";

		while (round < gameCount) {

			judge.changeState();
			judge.playGame();

			recorder.printScore(judge.playerA, judge.playerB);
			
			round++;
		}

		recorder.printEndMessage();

		winner = judge.getWinner();
		recorder.printResultMessage(winner);

	}
	
}
