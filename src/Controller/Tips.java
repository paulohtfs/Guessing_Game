package Controller;

public interface Tips {
	String get_correctAnswer();
	String[] getTips();
	String getOneTip(int tip);
	int getTipsLength();
	void addsTips(String tips);
	void setTips(String[] tips);
}
