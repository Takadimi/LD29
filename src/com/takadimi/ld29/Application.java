package com.takadimi.ld29;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import com.takadimi.ld29.states.Game;
import com.takadimi.ld29.states.Menu;

public class Application extends StateBasedGame {
	
	// Game States
	public static final int MENU_STATE = 0;
	public static final int GAME_STATE = 1;
	
	// Game Settings
	public static final int WIDTH = 640;
	public static final int HEIGHT = 480;
	public static final int FPS = 60;
	
	public Application(String name) {
		super(name);
	}

	public void initStatesList(GameContainer gc) throws SlickException {
		this.addState(new Menu(MENU_STATE));
		this.addState(new Game(GAME_STATE));
	}
	
	public static void main(String[] args) {
		
		try {
			AppGameContainer app = new AppGameContainer(new Application("Inner Monologue"));
			app.setDisplayMode(WIDTH, HEIGHT, false);
			app.setTargetFrameRate(FPS);
			app.setShowFPS(false);
			app.start();
		} catch (SlickException e) {
			e.printStackTrace();
		}
		
	}

}