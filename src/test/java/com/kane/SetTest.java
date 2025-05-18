package com.kane;


import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetTest {
	private Set<Integer> numbers;

	@BeforeEach
	void setUp() {
		numbers = new HashSet<>();
		numbers.add(1);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
	}

	@Test
	void testsize() {
		//given - input
		Set<Integer> sut = numbers;

		//when - action
		int actual = sut.size();

		//then - output
		assertThat(actual).isEqualTo(3);
	}

	@Test
	void set_size_success() {
		// given
		Set<Integer> sut = numbers;

		// when & then
		assertThat(sut).hasSize(3);
	}
}
