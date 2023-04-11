package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		int result = 1;
		for (int i=word.length()-1; i>=0; i--) {
			char c = word.charAt(i);
			if (c != word.charAt(word.length()-i-1)) {
				result = 0;
				break;
			}
		}
		System.out.println(result);
	}
}
