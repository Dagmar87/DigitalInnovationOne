package com.teste;

import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class AssertJTest {

	@Test
	public void checkEquality() {

		Person person = new Person("José", "Dagmar");
		//Person personC = new Person("José", "Dagmar");
		Person personC = person;
		assertThat(person).isEqualTo(personC);

	}

}
