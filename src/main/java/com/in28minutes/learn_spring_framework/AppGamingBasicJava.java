package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacMan;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		var marioGame = new MarioGame();
		var superContra = new SuperContraGame();
		var pacMan = new PacMan();
		var gameRunner = new GameRunner(pacMan);
		gameRunner.run();
	}
	
}
