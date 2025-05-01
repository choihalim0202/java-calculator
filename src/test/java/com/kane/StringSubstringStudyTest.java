package com.kane;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class StringSubstringStudyTest {

	private final StringSubstringStudy sut = new StringSubstringStudy();

	@Test
	void substring_success() {
		// given
		String input = "(1,2)";

		// when
		String actual = sut.substring(input);

		// then
		assertThat(actual).isEqualTo("1,2");
	}
}