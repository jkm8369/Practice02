package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		다음중 에러가 발생하는 문장은
		(1)	if( i=0 ) {….}   => i==0으로 해야 함
		(2)	if( j<10 ) {…}  
		(3)	switch( 'A' ){….}
		(4)	switch( 100 ){…}  => 변수는 숫자 불가능
		(5)	switch( "A" ){…}
		(6)	if( name == "홍길동" )  => 문자열 비교에는 부적합하다  문자열 비교는 .equals()써야함
		*/
		String name = "홍길동";
		
		if(name.equals("홍길동")) {
			
		}
		
		
		
		sc.close();
	}

}
