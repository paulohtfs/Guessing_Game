package View;

import Controller.Keypad;

public class Screen {
	
	private static Screen new_menu = null; 

	private Screen() {
	}

	public void displayMenu(){
		System.out.println("------------------------------");
		System.out.println("Menu");
		System.out.println("1>Star Game");
		System.out.println("2>Rank");
		System.out.println("3>Exit");
		System.out.println("------------------------------");
	}
	
	public void displayDifficulty(){
		System.out.println("------------------------------");
		System.out.println("Difficulty");
		System.out.println("1>Easy");
		System.out.println("2>Medium");
		System.out.println("3>Hard");
		System.out.println("------------------------------");
	}
	
	public void displayRank(){
		
	}
	
	public static Screen getScreen(){
		if(new_menu==null){
			new_menu = new Screen();
		}else{
			new_menu = null;
		}
		return new_menu;
	}
	
}
