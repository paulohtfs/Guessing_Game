package Model;

public abstract class Category {

	private static int difficulty_game = 0;
	

	public Category() {
	}
	
	public static int getDifficulty_game() {
		return difficulty_game;
	}
	
	public static void setDifficulty_game(int difficulty_game) {
		difficulty_game = difficulty_game;
	}

}
