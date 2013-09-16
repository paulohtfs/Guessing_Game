/*
 * File: Execute_GuessingGame.java
 * Purpose: Execução do programa
 */
package Controller;

public class Execute_GuessingGame {

	public Execute_GuessingGame() {
	}

	//	Inicialização do programa
	public static void main(String[] args) {
		try{
			Guessing_Game new_game = Guessing_Game.getGuessingGame();
			new_game.runGuessing_Game();			
		}catch(NullPointerException e){
			System.out.println("ERROR! Null Object!");
		}
	}

}
