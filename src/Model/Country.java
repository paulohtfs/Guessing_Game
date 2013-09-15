package Model;


public class Country extends Category{

	private String country_name = null;
	private String[] tips = {};
	
	public Country() {
		
	}

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
	public String[] getTips() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTips(String[] tips) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getTipsLength() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getOneTip(int tip) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get_correctAnswer() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
