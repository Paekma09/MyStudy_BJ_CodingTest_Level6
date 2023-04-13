package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		// 총합 변수 선언
		double[] sum = new double[C];
		// 평균 변수 선언
		double[] avg = new double[C];
		// 평균 넘는 학생 수 카운팅 변수 선언
		int[] count = new int[C];
		// 평균 넘는 학생 비율 변수 선언
		double[] avgS = new double[C];
		
		for(int i=0; i<C; i++) {
			int N = sc.nextInt();
			int[] score = new int[N];
			// 학생 점수 입력 받기
			for(int j=0; j<N; j++) {
				score[j] = sc.nextInt();
			}
			// 총합 구하기
			for(int k=0; k<N;k++) {
				sum[i] += score[k];
			}
			// 평균 구하기
			avg[i] = sum[i] / N;
			// 평균 넘는 학생 수 카운팅
			for(int l=0;l<N;l++) {
				if(avg[i] < score[l]) {
					count[i]++;
				}
			}
			// 평균 넘는 학생 비율 구하기
			avgS[i] = 100.000 * count[i] / N;
			System.out.printf("%.3f%% %n",avgS[i]);
		}
	}
}
