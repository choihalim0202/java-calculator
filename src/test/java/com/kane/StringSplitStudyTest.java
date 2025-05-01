package com.kane;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class StringSplitStudyTest {

	// 테스트 대상: sut -> (System Under Test)
	private final StringSplitStudy sut = new StringSplitStudy();


	@Test
	void split_case1_success() {
		// given: 테스트에 필요한 데이터 정리
		String input = "1,2";

		// when: sut 실행
		int[] actual = sut.split(input);

		// then: 결과 검증
		assertThat(actual).containsExactly(1, 2);
	}

	@Test
	void split_case2_success() {
		// given
		String input = "1";

		// when
		int[] actual = sut.split(input);

		// then
		assertThat(actual).containsExactly(1);

	}
}
