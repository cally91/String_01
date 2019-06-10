package com.biz.str;

public class String_03 {

	public static void main(String[] args) {

		String strNation = "Republic of korea";

		int intNationLen = strNation.length();

		// 문자열 1글자씩 분리해서
		// 문자로 바꾸는 코드
		// 바꾼 문자를 콘솔에 표시

		// 1번코드
		for (int i = 0; i < intNationLen; i++) {
			char c = strNation.charAt(i);
			System.out.print(c + "\t");
		}
		// 2번 코드

		for (int i = 0; i < strNation.length(); i++) {
			char c = strNation.charAt(i);
			System.out.print(c + "\t");
		}
		/*
		 * 1번 코드는 문자열 길이를 계산하여 변수에 담아두고 변수값을 읽어 for 반복문을 순화한다
		 * 
		 * 2번 코드는 문자열 길이를 계산 하기 위해여 문자열의 길이(개수)만큼 계속에서 length() 매소드를 호출한다 
		 * 
		 * 
		 * 따라서 1번 코드는 변수를 생성해야하는 번거로움이 있지만
		 * 2번에 비하면 실행속도가 더 빠르다.
		 * 
		 * 
		 */

	}

}
