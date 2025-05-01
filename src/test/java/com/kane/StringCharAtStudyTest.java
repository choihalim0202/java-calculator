package com.kane;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringCharAtStudyTest {

	private final StringCharAtStudy sut = new StringCharAtStudy();

	@Test
	void charAt_success() {
		// given
		String input = "abc";
		int index = 1;

		// when
		char actual = sut.charAt(input, index);

		// then
		assertThat(actual).isEqualTo('b');
	}

	@Test
	@DisplayName("charAt 실패 케이스 검증")
	void charAt_failed() {
		//given
		String input = "abc";
		int index = 3;

		// when & then
		assertThatThrownBy(() -> sut.charAt(input, index)) // () -> sut.charAt(input, index) 가 핵심
			.doesNotThrowAnyExceptionExcept(StringIndexOutOfBoundsException.class);
	}
}