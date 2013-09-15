package Model;


public class Famous extends Category {

	private String famous_name = null;
	private String[] tips = null;
	
	public Famous() {
		famous_name = "Jack Johnson";
		addsTips("It's a singer");
		addsTips("Folks style");
		addsTips("Won a grammy in 2004");
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

	public String getFamous_name() {
		return famous_name;
	}

	public void setFamous_name(String famous_name) {
		this.famous_name = famous_name;
	}

	@Override
	public String[] getTips() {
		return tips;
	}

	@Override
	public void setTips(String[] tips) {
		this.tips = tips;
	}

	
}
