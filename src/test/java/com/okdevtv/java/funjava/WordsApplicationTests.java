package com.okdevtv.java.funjava;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class WordsApplicationTests {

	@Test
	void getString() {
		String words = Words.getString();
		assertNotNull(words);
	}

}
