package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			for (int j=0; j<N-i; j++) {
				if (j<N) {
					System.out.print(" ");
				}	
			}
			for (int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<N; i++) {
			for (int j=1; j<=2*N-1-i; j++) {
				if (j<=i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
