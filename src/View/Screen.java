package View;

import Controller.Keypad;
import Model.Category;

public class Screen {
	
	private int tip = 0;
	private static Screen new_menu = null;
	private String correct_answer = null;

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
		System.out.println("------------------------------");
	}
	
	public void displayGameStatus(int num_guesses, int num_tips){
		System.out.println("------------------------------");
		System.out.println("Guesses: " + num_guesses);
		System.out.println("Tips: " + num_tips);
		System.out.println("------------------------------");
	}
	
	public void displyaGuessingOption(){
		System.out.println("------------------------------");
		System.out.println("1>Guess");
		System.out.println("2>Tips");
		System.out.println("------------------------------");		
	}
	
	public void displayTips(Category toGuess){
		System.out.println("------------------------------");				
		System.out.println(toGuess.getOneTip(this.tip));
		System.out.println("------------------------------");	
		this.tip++;
	}
	
	public void displayLose(){		
		System.out.println("------------------------------");		
		System.out.println("Sorry. You Lose");
		System.out.println("------------------------------");		
	}
	
	public void displayWin(){		
		System.out.println("------------------------------");		
		System.out.println("You Win!");
		System.out.println("Correct Answer: "+correct_answer);
		System.out.println("------------------------------");		
	}
	
	public void displayWrong(){		
		System.out.println("------------------------------");		
		System.out.println("Wrong Guess");
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

	public int getTip() {
		return tip;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}
	
}
