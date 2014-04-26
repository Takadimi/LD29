package com.takadimi.ld29.states;

import org.lwjgl.input.Mouse;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu implements GameState {
	
	private int id;
	private float beginBtnX 		= 210;
	private float beginBtnY 		= 165;
	private float beginBtnWidth 	= 225;
	private float beginBtnHeight 	= 45;
	private Rectangle beginBtn = new Rectangle(beginBtnX, beginBtnY, beginBtnWidth, beginBtnHeight); 
	private boolean startGame = false;
	
	public Menu(int state) {
		this.id = state;
	}
	
	public void mouseClicked(int button, int x, int y, int clickCount) {

	}

	public void mouseDragged(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(int button, int x, int y) {
		
		if (button == 0) {
			if ((x > beginBtn.getMinX() && x < beginBtn.getMaxX()) && (y > beginBtn.getMinY() && y < beginBtn.getMaxY())) {
				System.out.println("Button pressed");
				this.startGame = true;
			}
		}
		
	}

	public void mouseReleased(int arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	public void mouseWheelMoved(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void inputEnded() {
		// TODO Auto-generated method stub
		
	}

	public void inputStarted() {
		// TODO Auto-generated method stub
		
	}

	public boolean isAcceptingInput() {
		// TODO Auto-generated method stub
		return false;
	}

	public void setInput(Input arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(int arg0, char arg1) {
		// TODO Auto-generated method stub
		
	}

	public void controllerButtonPressed(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	public void controllerButtonReleased(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	public void controllerDownPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerDownReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerLeftPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerLeftReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerRightPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerRightReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerUpPressed(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void controllerUpReleased(int arg0) {
		// TODO Auto-generated method stub
		
	}

	public void enter(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {

		System.out.println("Entering Menu State");
	}

	public int getID() {
		return this.id;
	}

	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		
	}

	public void leave(GameContainer gc, StateBasedGame sbg)
			throws SlickException {
		System.out.println("Leaving Menu State");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		g.drawString("~~~~~" + sbg.getTitle() + "~~~~~", 210, 120);
		g.draw(this.beginBtn);
		g.drawString("Begin", 295, 180);
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		Input input = gc.getInput();
		
		if (input.isMousePressed(0)) {
			mousePressed(0, input.getMouseX(), input.getMouseY());
		}
		
		if (this.startGame) {
			sbg.enterState(1);
		}
		
	}
	
}