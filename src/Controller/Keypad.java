package Controller;

import java.util.Scanner;


public class Keypad {

	private static Keypad new_keypad = null;
	private Scanner input = null;
	
	public Keypad() {
		input = new Scanner(System.in);
	}

	public int get_intInput(){
		int result = 0;
		result = input.nextInt();
		return result;
	}
	
	public String get_stringInput(){
		String result = null;
		result = input.next();
		return result;
	}
	
	public static Keypad getKeypad(){
		if(new_keypad==null){
			new_keypad = new Keypad();
		}else{
			new_keypad = null;
		}
		return new_keypad;
	}
}
