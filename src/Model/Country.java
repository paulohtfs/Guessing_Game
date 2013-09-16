/*
 * File: Country.java
 * Purpose: Representação de um País para adivinhação
 */
package Model;


public class Country extends Category{

	private String country_name = null;
	private String[] tips = {}; 
	
	public Country() {
		
	}

	//	Adiciona uma nova dica ao conjunto de dicas
	@Override
	public void addsTips(String tips) {
		
		int current_length = this.tips.length;
		
		if(current_length>10){
			System.out.println("Max tips");
		}else{
			String[] new_tips = new String[current_length+1];
			for(int i = 0; i<current_length;i++){
				new_tips[i] = this.tips[i];
			}
			new_tips[new_tips.length-1] = tips;
			this.setTips(new_tips);
		}
	}
	
	@Override
	public String getOneTip(int tip) {
		String result = null;			
		if(tip<tips.length){
			result = tips[tip];
		}else{
			result = null;
		}
		return result;
	}
	
	@Override
	public String get_correctAnswer() {
		String result = this.country_name;
		return result;
	}

	@Override
	public String[] getTips() {
		return tips;
	}

	@Override
	public void setTips(String[] tips) {
		this.tips = tips;
	}

	@Override
	public int getTipsLength() {
		return (this.tips.length);
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	

}
