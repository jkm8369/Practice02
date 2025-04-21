package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해 주세요.");
		System.out.print("금익: ");
		double income = sc.nextDouble();
		
		
		
		if(0<=income && income<=1000) {
			System.out.println("소득세는 " + (0.09*income) + " 입니다.");
			
		} else if( 1000<=income && income<=4000) {
			System.out.println("소득세는 " + ( (1000*0.09) + (0.18*(income-1000)) ) + " 입니다.");
			
		} else if( 4000<=income && income<=8000) {
			System.out.println("소득세는 " + ( (1000*0.09) + (3000*0.18) +(0.27*(income-4000)) ) + " 입니다.");
			
		} else if(8000<=income) {
			System.out.println("소득세는 " + ( (1000*0.09) + (3000*0.18) + (4000*0.27) +(0.36*(income-8000)) ) + " 입니다.");
			
		} else {
			System.out.println("잘못 입력했습니다.");
			
		}
		
		

		
		
		sc.close();
	}

}
