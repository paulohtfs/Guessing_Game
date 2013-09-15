package Model;

public class Player {
	
	private static final int EASY = 1; 
	private static final int MEDIUM = 2; 
	private static final int HARD = 3; 
	
	private double player_score = 0;
	private int player_guesses = 0;
	private int player_tips = 0;
	
	private String player_name = null;
	
	public Player() {
	}
	
	public void setDifficulty(){
		this.player_guesses = totalGuesses();
		this.player_tips = totalTips();
	}
	
	public void decreasGuesses(){
		this.player_guesses--;
	}
	
	public void decreasTips(){
		this.player_tips--;
	}
	
	private int totalGuesses(){
		
		int result = 0;
		int difficulty = Category.getDifficulty_game();
		
		switch(difficulty){
		case EASY:
			this.player_guesses = 20;
			break;
		case MEDIUM:
			this.player_guesses = 15;
			break;
		case HARD:
			this.player_guesses = 10;
			break;
		default:
			break;
		}
		return result;
	}
	
	private int totalTips(){
		
		int result = 0;
		int difficulty = Category.getDifficulty_game();
		
		switch(difficulty){
		case EASY:
			this.player_tips = 10;
			break;
		case MEDIUM:
			this.player_tips = 5;
			break;
		case HARD:
			this.player_tips = 3;
			break;
		default:
			break;
		}		
		return result;
	}
	
	
	public String getPlayer_name() {
		return player_name;
	}
	
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	
	public double getPlayer_score() {
		return player_score;
	}
	
	public void setPlayer_score(double player_score) {
		this.player_score = player_score;
	}
	
	public int getPlayer_guesses() {
		return player_guesses;
	}
	
	public void setPlayer_guesses(int player_guesses) {
		this.player_guesses = player_guesses;
	}
	
	public int getPlayer_tips() {
		return player_tips;
	}
	
	public void setPlayer_tips(int player_tips) {
		this.player_tips = player_tips;
	}
}
