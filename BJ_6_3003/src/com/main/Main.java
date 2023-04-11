package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] chess = new int[6];
		int[] normal = {1,1,2,2,2,8};
		int[] add = new int[chess.length];
		
		for (int i=0; i<chess.length; i++) {
			chess[i] = sc.nextInt();
		}
		
		for (int i=0; i<chess.length; i++) {
			add[i] = normal[i] - chess[i];
			System.out.print(add[i]+" ");
		}
	}
}
