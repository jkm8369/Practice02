package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {         // 계산 할 수 없습니다가 안뜸

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		
		//기호 : symbol
		String symbol = sc.nextLine();
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
		
		switch(symbol) {
			case "+" :
				
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		if( symbol.equals("+") ) {
			System.out.println("결과는: " + (num1+num2) + "입니다." );
			
		} else if( symbol.equals("-") ) {
			System.out.println("결과는: " + (num1-num2) + "입니다." );
			
		} else if( symbol.equals("*") ) {
			System.out.println("결과는: " + (num1*num2) + "입니다." );
			
		} else if( symbol.equals("/") ) {
			System.out.println("결과는: " + (num1/num2) + "입니다.");
			
		} else if( symbol.equals("/") && num2 == 0 ) {
			System.out.println("계산할 수 없습니다.");
			
		} else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		*/
		
		sc.close();
	}

}
