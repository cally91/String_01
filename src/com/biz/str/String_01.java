package com.biz.str;

public class String_01 {

	public static void main(String[] args) {

		// 일반적인 변수를 만드는 방법으로
		// 문자열 변수를 생성한다.
		// 문자열 변수 => 문자열 객채하고 한다.
		String strNaton ="Republic of korea";
		
		// new 키워드를 사용해서 문자열 변수(객체)를 생성
		// 비어있는 (black)변수(객체)를 생성한다.
		String strName =new String() ;
		
		//String strHong="홍길동";
		String strHong =new String("홍길동") ;
		
		// 문자열은 + 연사을 통해서 문자열을 연결할수있다.
		System.out.println("Nation : " +strNaton);
	}

}
