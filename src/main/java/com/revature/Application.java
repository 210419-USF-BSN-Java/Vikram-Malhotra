package com.revature;

public class Application {

	public static void main (String args) {
		Application word = new Application();
		
		System.out.println(word.printNumberInWord(3));
	}
	
	public String printNumberInWord(int number) {
		//TODO Write an implementation for this method declaration
		String s = "";
		if (number == 0) {
			s = "ZERO";
		}
		else if (number == 1) {
			s = "ONE";
		}
		else if (number == 2) {
			s = "TWO";
		}
		else if (number == 3) {
			s = "THREE";
		}
		else if (number == 4) {
			s = "FOUR";
		}
		else if (number == 5) {
			s = "FIVE";
		}
		else if (number == 6) {
			s = "SIX";
		}
		else if (number == 7) {
			s = "SEVEN";
		}
		else if (number == 8) {
			s = "EIGHT";
		}
		else if (number == 9) {
			s = "NINE";
		}
		else {
			s = "OTHER";
		}
		
		return s;
	}
	public String reverse(String string) {
//		TODO Write an implementation for this method declaration
		String reverse = ""; //empty string
		for (int a = string.length() -1; a >= 0; a--) {
			reverse += string.charAt(a);
		}
		return reverse;
	}
	
	
}
