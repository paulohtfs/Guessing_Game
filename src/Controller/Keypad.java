/*
 * File: Keypad.java
 * Purpose: Representa as entradas inseridas pelo usuário
 */
package Controller;

import java.util.Scanner;


public class Keypad {

	private static Keypad new_keypad = null;
	private Scanner inputInt = null;
	private Scanner inputString = null;
	
	public Keypad() {
		inputInt = new Scanner(System.in);
		inputString = new Scanner(System.in);
	}

	public int get_intInput(){
		int result = 0;
		result = inputInt.nextInt();
		return result;
	}
	
	public String get_stringInput(){
		String result = null;
		result = inputString.nextLine();
		return result;
	}
	
	//	Estabelece condição para apenas uma instancia desta class
	public static Keypad getKeypad(){
		if(new_keypad==null){
			new_keypad = new Keypad();
		}else{
			new_keypad = null;
		}
		return new_keypad;
	}
}
