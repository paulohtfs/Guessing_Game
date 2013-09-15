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
	
	public void displayCategory(){
		System.out.println("------------------------------");
		System.out.println("Category");
		System.out.println("1>Famous");
		System.out.println("2>Country");
		System.out.println("------------------------------");
	}
	
	public void displayNewGame(){
		System.out.println("------------------------------");
		System.out.println("Good Luck!");
		System.out.println("Type 1 to display tips");		
		System.out.println("------------------------------");
	}
	
	public void displayGameStatus(int num_guesses, int num_tips){
		System.out.println("------------------------------");
		System.out.println("Guesses: " + num_guesses);
		System.out.println("Tips: " + num_tips);
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
