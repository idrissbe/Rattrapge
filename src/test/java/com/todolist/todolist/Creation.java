package com.todolist.todolist;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.junit.Assert.*;
import org.junit.*;

public class Creation {
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		try {
			ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext(
					new String[] { "applicationContext.xml" });
			assertTrue(true);
		} catch (Exception e) {
			assertTrue(e.getMessage(), false);
		}
	}
}
