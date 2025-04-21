package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		System.out.print("숫자3: ");
		int num3 = sc.nextInt();
		
		int big, small, middle;
		
		
		if(num1<num2 && num2<num3) {
			big = num3;
			middle = num2;
			small = num1;
			System.out.println("가장 작은수는 " + small + " 입니다.");
			
		} else if(num2<num1 && num1<num3) {
			big = num3;
			middle = num1;
			small = num2;
			System.out.println("가장 작은수는 " + small + " 입니다.");
			
		} else if(num3<num2 && num2<num1) {
			big = num1;
			middle = num2;
			small = num3;
			System.out.println("가장 작은수는 " + small + " 입니다.");
			
		} else if(num2<num3 && num3<num1) {
			big = num1;
			middle = num3;
			small = num2;
			System.out.println("가장 작은수는 " + small + " 입니다.");
			
		} else if(num1<num3 && num3<num2) {
			big = num2;
			middle = num3;
			small = num1;
			System.out.println("가장 작은수는 " + small + " 입니다.");
			
		} else if(num3<num1 && num1<num2) {
			big = num2;
			middle = num1;
			small = num3;
			System.out.println("가장 작은수는 " + small + " 입니다.");
			
		} else if (num1==num2 && num2 == num3){
			System.out.println("가장 작은수는 " + num1 + " 입니다.");
		}
		
		sc.close();
	}

}
