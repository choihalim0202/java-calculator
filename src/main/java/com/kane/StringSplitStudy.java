package com.kane;

public class StringSplitStudy {

	/**
	 * 접근 제어자
	 * 리턴 타입
	 * 메서드 이름
	 * 매개 변수
	 * 메서드 바디
	 * <p>
	 * debug란?
	 * breakpoint란?
	 * Step Into
	 * Step Out
	 * Step Over
	 */
	public int[] split(String input) {
		String[] result = input.split(",");
		// 문자열 배열을 숫자 배열로 변경
		int[] numbers = new int[result.length]; // int 배열을 result의 사이즈로 초기화
		// primitive type의 값은 설정해주지 않을 경우 기본값 0

		for (int i = 0; i < result.length; i++) { // result의 length 만큼 반복문 진행
			int number = Integer.parseInt(result[i]); // result[i]를 int로 타입 변환
			numbers[i] = number; // numbers의 배열에 number 삽입
		}

		return numbers; // number return
	}
}
