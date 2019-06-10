package com.biz.str;

public class String_08 {

	public static void main(String[] args) {

		String userID="korea";
		String password = "lee1234";
		
		/*
		 * 문자열을 비교연산할때는
		 * equals() 매서드를 사용한다
		 * 단, 대소문자 구분없이 비교하고자 할때는
		 * equalsIgnoreCase()를 사용하면된다
		 */
		if(userID.equalsIgnoreCase("KOREA")== false) {
			System.out.println("사용자 정보가 잘못되었습니다");
			
			
		}else if (password.equals("lee1234") ==false) {
			System.out.println(" 아이디/비밀번호가 잘못되었습니다");
		}else{
			System.out.println("로그인 성공!");
		}
		
	}

}
