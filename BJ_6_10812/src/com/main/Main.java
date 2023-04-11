package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		int[] rotationArr = new int[N];
		
		for (int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int a = 1; a<=M; a++) {
			int i = sc.nextInt()-1;
			int j = sc.nextInt()-1;
			int k = sc.nextInt()-1;
			
			int I = i;
			
			for (int b=0; b<j-i+1; b++) {
				if (k+b <=j) {
					rotationArr[b+i] = arr[k+b];
				} else {
					rotationArr[b+i] = arr[I];
					I++;
				}
			}
			for (int b=0; b<N; b++) {
				if(rotationArr[b] != 0) {
					arr[b] = rotationArr[b];
				}
			}
		}
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
