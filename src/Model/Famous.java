package Model;


public class Famous extends Category {

	private String famous_name = null;
	private String[] tips = {};
	
	public Famous() {
		
	}
	
	@Override
	public void addsTips(String tips){
		
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
		String result = this.famous_name;
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

	public String getFamous_name() {
		return famous_name;
	}

	public void setFamous_name(String famous_name) {
		this.famous_name = famous_name;
	}
	
}
