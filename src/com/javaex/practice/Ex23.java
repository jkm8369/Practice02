package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해주세요.");
		System.out.print("년도: ");
		int year = sc.nextInt();
		System.out.print("올해: ");
		int thisYear = sc.nextInt();
		System.out.print("태어난해: ");
		int birthYear = sc.nextInt();
		int age = 2023 - birthYear;
		
		
		System.out.println("나이: " + age );
		System.out.println("================================");
		
		if(age>=20) {
			System.out.println("20살 이상");
			
		} else {
			System.out.println("20살 미만 건강검진대상이 아님");
			
		}
		
		
		if(birthYear%2 == 0 && thisYear%2 == 0 && age>=20) {
			System.out.println("건강검진해");
			
		} else if (birthYear%2 ==0 && thisYear%2 == 1 && age>=20){
			System.out.println("건강검진해 아님");
		}
		
		if(birthYear%2 == 1 && thisYear%2 == 1 && age>=20) {
			System.out.println("건강검진해");
			
		} else if(birthYear%2 ==1 && thisYear%2 == 0 && age>=20) {
			System.out.println("건강검진해 아님");
			
		}
		
		if(age>=40) {
			System.out.println("암 검사");
		}
		
		sc.close();
	}

}
