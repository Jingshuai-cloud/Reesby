package com.Reesby.CRUD;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class CrudApplicationTests {

	@Test
	void contextLoads() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate now = LocalDate.now();
		LocalDate before = LocalDate.now().minusDays(7);
		System.out.println(dtf.format(now));
		System.out.println(dtf.format(before));
	}

}
