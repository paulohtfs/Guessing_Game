package Controller;

import View.Menu;

public class Guessing_Game {

	private Database database = null;
	private Menu menu = null;
	private boolean stop_game = false;
	private static Guessing_Game new_game = null;
	
	private Guessing_Game() {
		database = new Database();
		menu = new Menu();
	}
	
	public void runGuessing_Game(){
		while(!stop_game){
			
		}
	}

	public static Guessing_Game getGuessingGame(){
		if(new_game==null){
			new_game = new Guessing_Game();
		}else{
			new_game = null;
		}
		return new_game;
	}
}
