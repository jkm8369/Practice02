package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요.");
		System.out.print("알파벳: ");
		String alphabet = sc.nextLine();
		
		/*
		if( alphabet.equals("a") ) {
			System.out.println("모음입니다.");
			
		} else if( alphabet.equals("e") ) {
			System.out.println("모음입니다.");
			
		} else if( alphabet.equals("i") ) {
			System.out.println("모음입니다.");
			
		} else if( alphabet.equals("o") ) {
			System.out.println("모음입니다.");
			
		} else if( alphabet.equals("u") ) {
			System.out.println("모음입니다.");
			
		} else {
			System.out.println("자음입니다.");
			
		}
		*/
		
		if( alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i")
		|| alphabet.equals("o") || alphabet.equals("u") ) {
			System.out.println("모음입니다.");
			
		} else {
			System.out.println("자음입니다.");
			
		}
		
		
		
		sc.close();
	}

}
