package com.biz.str;

public class String_06 {

	public static void main(String[] args) {

		String strNation ="Repudlic of korea";
		String[] s1= strNation.split("");
		
		//s1은 낱개 문자열을 담고 있는 배열이 된다
		// 이 s1 문자열 배열에서
		//영문자 o가 최초로 몇번째에 나타나는지 
		//찾아 봅시다.
		
		
		
		for( int i = 0; i< s1.length; i++) {
		//	if(s1[i]=="o") {
			if(s1[i].equals("o")) {
			System.out.println(i +"번째에서 찾습");
				break;
			}
		}
		/*
		 * 문자열은 == 를 사용 해서 비교를 할경우
		 * 문자열 변수에 저장된 값을 상대로 비교 하지않고
		 * 실제 문자열이 저장된 주소를 상대로 비교를 한다.
		 * 
		 * 따라서 문자열 변수에 저장된 값을 어떤문자열과 비교하고자 할때는
		 * == 대신에 equals()메서드를 사용해야 한다.
		 * 
		 */
		
		
		
		
	}

}
