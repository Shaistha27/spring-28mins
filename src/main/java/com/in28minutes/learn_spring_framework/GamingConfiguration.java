package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.PacMan;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game1() {
		var game = new PacMan();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game1) {
		var gameRunner = new GameRunner(game1);
		return gameRunner;
	}
}
