package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자: ");
		double num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("계산결과는 " + ( (num*num*num) + (-9*num) +2 ) + "입니다." );
			
		} else {
			System.out.println("계산결과는 " + ( (7*num) + 2 ) + "입니다.");
		}
		
		
		
		sc.close();
	}

}
