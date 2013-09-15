package Controller;

import View.Screen;
import Model.*;

public class Guessing_Game {

	private static final int EASY = 1; 
	private static final int MEDIUM = 2; 
	private static final int HARD = 3; 
	private static final int FAMOUS = 1; 
	private static final int COUNTRY = 2; 
	
	private boolean stop_game = false;
	private int category_choice = 0;
	
	private static Guessing_Game new_game = null;
	
	private Player new_player = null;
	private Rank new_rank = null;
	private Database database = null;
	private Screen new_screen = null;
	private Keypad new_keypad = null;
	
	
	private Guessing_Game() {
		stop_game = false;
		database = new Database();
		new_screen = Screen.getScreen();
		new_keypad = Keypad.getKeypad();
	}
	
	public void runGuessing_Game(){
		while(!stop_game){
			new_screen.displayMenu();
			mainOption();
		}
	}

	public void getGameOption(){
		new_screen.displayDifficulty();
		difficultyOption();
		new_screen.displayCategory();
		categoryOption();
		
	}
	
	public void startNewGame(){
		new_screen.displayNewGame();
		while(!stop_game){
			new_screen.displayGameStatus(0, 0);
			
		}
	}
	
	public void categoryOption(){
		int option = getOption();
		switch(option){
		case 1:
			this.category_choice = FAMOUS;
			break;
		case 2:
			this.category_choice = COUNTRY;
			break;
		default:
			break;
		}
	}
	
	public void difficultyOption(){
		int option = getOption();
		switch(option){
		case 1:
			Category.setDifficulty_game(EASY);
			break;
		case 2:
			Category.setDifficulty_game(MEDIUM);
			break;
		case 3:
			Category.setDifficulty_game(HARD);
			break;
		default:
			break;
		}
	}
	
	public void mainOption(){
		int option = getOption();
		switch(option){
		case 1:
			getGameOption();
			break;
		case 2:
			new_screen.displayRank();
			break;
		case 3:
			this.stop_game = true;
			break;
		default:
			break;
		}
	}
	
	public int getOption(){
		int result = 0;
		result = new_keypad.get_intInput();
		return result;
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
