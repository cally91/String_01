package com.biz.str;

import javax.print.DocFlavor.STRING;

public class String_12 {

	/*
	 * 정규화문법 ( Repula Expreeion)
	 * 문자열의 정규식
	 * -- (여러가지)조건에 맞는 문자열이 있는지 검사하는 특별한 문법
	 * -- 프로그래밍 언어에 관계없이
	 * -- 개부분의 언어에서 취급하는 규칙
	 */
	public static void main(String[] args) {

		String strNation="Repulic of Korea";
		//대문자 R로 시작하고 뒤에 1글자가 있는 조건에 맞느냐?
		boolean bYes = strNation.matches("\bR./");
		//R로 시작하고 뒤에 3글자 (...)가있는 조건에 맞느냐
		
		bYes =strNation.matches("R...");
		
		// 숫자형문자열 (0부터 9까지 )가 포함되어 있느냐
		bYes =strNation.matches("[0-9]");
		
		String strEmali= "cally91@naver.com";
		
		// 가장간단히 emali주소가 올바르게 입력되었는지 건사하는 코드
		bYes =strEmali.matches("[A-Za-z]+@[A-Za-z]+\\.[A-Za-z]+");
		System.out.println(bYes);
		
	}

}
