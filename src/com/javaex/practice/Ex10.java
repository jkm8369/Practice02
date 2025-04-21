package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		// 잘 모름 복습하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 2개를 입력해주세요.");
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		int big, small;
		
		if( num1>num2 ) {
			big = num1;
			small = num2;
			
		} else {
			big = num2;
			small = num1;
			
		}
		
		System.out.println("큰수: " + big + "\t \t 작은수: " + small + "입니다.");
		
		
		
		sc.close();
	}
}
