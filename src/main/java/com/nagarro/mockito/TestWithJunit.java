package com.nagarro.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TestWithJunit {

	private Calculator cal;

	@Test
	public void testAdd() {
		cal = new Calculator(3, 5);
		assertSame("Invalid sum", 8, cal.add(3, 5));
	}

}
