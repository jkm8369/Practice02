package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		// 잘 모름 복습하기
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		
		int big, small;
		
		if( num1 > num2) {
			big = num1;
			small = num2;
			
		} else {
			big = num2;
			small = num1;
		}
		
		System.out.println("몫: " + (big/small) );
		System.out.println("나머지: " + (big%small) );
		
		
		
		sc.close();
	}
}
