/*
 * File: Player
 * Purpose: Representação do jogador quanto as tentativas, pontuações...
 */
package Model;

import java.util.Random;

public class Player {
	
	private static final int EASY = 1; 
	private static final int MEDIUM = 2; 
	private static final int HARD = 3; 
	private static final int FAMOUS = 1; 
	private static final int COUNTRY = 2; 
	
	private double player_score = 0;
	private int player_guesses = 0;	//	Quantidade máxima de tentativas de adivinhação
	private int player_tips = 0; //	Quantidade máxima de dicas a serem exibidas
	
	private String player_name = null; 
	private Category[] categories = {}; //	Contem todos os itens para adivinhação
	
	public Player() {
	}
	
	//	Adiciona categoria ao vetor"categories"
	public void addsCategories(Category categories){
		
		int current_length = this.categories.length;
		
		if(current_length>10){
			System.out.println("Max Category");
		}else{
			Category[] new_category = new Category[current_length+1];
			for(int i = 0; i<current_length;i++){
				new_category[i] = this.categories[i];
			}
			new_category[new_category.length-1] = categories;
			this.setCategories(new_category);
		}
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
	
	//	Avalia a quantidade de adivinhações com base na dificuldade
	private int totalGuesses(){
		
		int result = 0;
		int difficulty = Category.getDifficulty_game();
		
		switch(difficulty){
		case EASY:
			this.player_guesses = 20;
			result = this.player_guesses;
			break;
		case MEDIUM:
			this.player_guesses = 15;
			result = this.player_guesses;
			break;
		case HARD:
			this.player_guesses = 10;
			result = this.player_guesses;
			break;
		default:
			break;
		}
		return result;
	}
	
	//	Avalia a quantidade de dicas para visualizar com base na dificuldade
	private int totalTips(){
		
		int result = 0;
		int difficulty = Category.getDifficulty_game();
		
		switch(difficulty){
		case EASY:
			this.player_tips = 10;
			result = this.player_tips;
			break;
		case MEDIUM:
			this.player_tips = 5;
			result = this.player_tips;
			break;
		case HARD:
			this.player_tips = 3;
			result = this.player_tips;
			break;
		default:
			break;
		}		
		return result;
	}
	
	//	Retorna um item aleatorio para 
	//	adivinhação com base na categoria escolhida
	public Category getRandom(int category){
		
		Category result_category = null;
		
		switch(category){
		case FAMOUS:
			result_category = getInstanceof(category);
			break;
		case COUNTRY:
			result_category = getInstanceof(category);
			break;
		}
		return result_category;
	}
	
	//	Verifica a instacia da categoria e retorna um
	//	upcasting categoria a partir de um numero aleatorio
	public Category getInstanceof(int category){
		
		Category result_category = null;
		int randomNumber = randomNumber();
		
		switch(category){
		case FAMOUS:
			while(!(result_category instanceof Famous)){
				result_category = categories[randomNumber];
			}
			break;
		case COUNTRY:
			while(!(result_category instanceof Country)){
				result_category = categories[randomNumber];
			}
			break;			
		}
		return result_category;
	}
	
	//	Gerador de numero aleatório
	public int randomNumber(){
		int result = 0;
		Random random = new Random(System.currentTimeMillis());
		random.nextInt(this.categories.length);
		result = random.nextInt(this.categories.length);
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

	public Category[] getCategories() {
		return categories;
	}

	public void setCategories(Category[] categories) {
		this.categories = categories;
	}
	
	
}
