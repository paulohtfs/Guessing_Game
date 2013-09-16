/* File: Guessing_Game.java
 * Purpose: Essa classe representa o controle interno do jogo
 */
package Controller;

import View.Screen;
import Model.*;

public class Guessing_Game {

	//	Constantes para identificar pontos criticos
	private static final int EASY = 1; 
	private static final int MEDIUM = 2; 
	private static final int HARD = 3; 
	private static final int FAMOUS = 1; 
	private static final int COUNTRY = 2; 
	
	private boolean stop_game = false; //	Condição para parada total do jogo
	
	private static Guessing_Game new_game = null; // Utilizado para verificar unica instancia
	
	private Category item_toGuess = null;
	private Player current_player = null;
	private Rank new_rank = null;
	private Database database = null;
	private Screen new_screen = null;
	private Keypad new_keypad = null;
	
	
	private Guessing_Game() {
		stop_game = false;
		database = new Database();
		current_player = new Player();
		new_screen = Screen.getScreen();
		new_keypad = Keypad.getKeypad();
	}
	
	//	Dá inicio ao jogo
	public void runGuessing_Game(){
		while(!stop_game){
			new_screen.displayMenu();
			mainOption();
		}
	}

	
	//	Define as configurações do jogo a 
	//	partir da opçõe do usuário
	public void getGameOption(){
		new_screen.displayDifficulty();
		difficultyOption();
		new_screen.displayCategory();
		categoryOption();
		startNewGame();
	}
	
	//	Começa uma nova partida
	public void startNewGame(){
		
		new_screen.displayNewGame();
		current_player.setDifficulty();
		
		while(!stop_game){
			
			int tips = current_player.getPlayer_tips();
			int guesses = current_player.getPlayer_guesses();
			new_screen.displayGameStatus(guesses, tips);
			new_screen.displyaGuessingOption();
			guessingOption();
		}
	}
	
	//	Estabelece condições para parada do jogo
	public void tryGuess(){
		
		String guess = getGuess();
		
		if(matchGuess(guess)){
			new_screen.displayWin();
			this.stop_game = true;
		}else{
			new_screen.displayWrong();
			this.current_player.decreasGuesses();
			this.stop_game = false;
		}
	}
	
	//	Faz o comparativo entre o item a ser adivinhado
	//	e a tentativa do usuário.
	public boolean matchGuess(String guess){
		boolean result = false;
		String correct_answer = item_toGuess.get_correctAnswer();
		
		correct_answer = correct_answer.replaceAll("\\s+", "");
		guess = guess.replaceAll("\\s+", "");
		
		if(guess.equalsIgnoreCase(correct_answer)){
			new_screen.setCorrect_answer(correct_answer);
			result = true;
		}else{
			result = false;
		}
		return result;
	}
	
	//	Define fluxo de acordo com a opção do usuário
	//	para o menu de adivinhações
	public void guessingOption(){
		int option = getOption();
		switch(option){
		case 1:
			tryGuess();
			break;
		case 2:
			int tip_number = new_screen.getTip();
			if(item_toGuess.getOneTip(tip_number) != null){
				new_screen.displayTips(item_toGuess);
				this.current_player.decreasTips();				
			}else{
				this.current_player.setPlayer_guesses(0);
			}
			break;
		default:
			break;
		}
	}
	
	//	Define fluxo de acordo com a opção do usuário
	//	para o menu de categorias
	public void categoryOption(){
		int option = getOption();
		switch(option){
		case 1:
			item_toGuess = current_player.getRandom(FAMOUS);
			break;
		case 2:
			item_toGuess = current_player.getRandom(COUNTRY);
			break;
		default:
			break;
		}
	}
	
	//	Define fluxo de acordo com a opção do usuário
	//	para o menu de dificuldades
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
	
	//	Define fluxo de acordo com a opção do usuário
	//	para o menu principal
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
	
	//	Coleta o inteiro correspondente a opção
	//	do menu inserida pelo usuário
	public int getOption(){
		return new_keypad.get_intInput();
	}
	
	//	Coleta a stringe correspondente a tentativa de
	//	adivinhação do usuário
	public String getGuess(){
		return new_keypad.get_stringInput();
	}
	
	//	Estabelece condição para apenas uma instancia desta classe
	public static Guessing_Game getGuessingGame(){
		if(new_game==null){
			new_game = new Guessing_Game();
		}else{
			new_game = null;
		}
		return new_game;
	}
}
