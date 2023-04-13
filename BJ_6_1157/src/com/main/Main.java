package com.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자열 입력 받음과 동시에 대문자로 변경
		String word = sc.nextLine().toUpperCase();
		// 문자열을 문자 배열 형태로 변환
		char[] wordc = word.toCharArray();			
		// 입력받은 문자열의 중복된 문자 제거
		String Word = "";
		for(int i=0; i<word.length();i++) {
			if(word.indexOf(word.charAt(i)) == i) {
				Word += word.charAt(i);
			}
		}
		// 중복된 문자 제거 한 문자열과 기존 문자 배열과 비교하여 중복 갯수 카운팅
		int[] count = new int[Word.length()];		
		for(int i=0;i<wordc.length;i++) {
			for(int j=0;j<Word.length();j++) {
				if(wordc[i] == Word.charAt(j)) {
					count[j]++;
				}
			}
		}
		// 최대값 인덱스 구하기
		int maxIndex = 0;
		for(int i=0;i<count.length;i++) {
			if(count[i]>count[maxIndex]) {
				maxIndex = i;
			}
		}
		// 최대값 중복 확인
		boolean result = true;
		for(int i=0;i<count.length-1;i++) {
			for(int j=i+1; j<count.length;j++) {
				if(count[maxIndex] == count[i] && count[i] == count[j]) {
					result = false;
					break;
				}
			}
		}
		// 중복확인 후 최대값을 가진 인덱스의 문자 출력
		if (result == false) {
			System.out.println("?");
		} else {
			System.out.println(Word.charAt(maxIndex));
		}
	}
}
