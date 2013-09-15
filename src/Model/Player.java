package Model;

public class Player {

	private double player_score = 0;
	private int player_guesses = 0;
	private int player_tips = 0;
	
	private String player_name = null;
	private Category[] categorys = null;
	
	public Player() {
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
