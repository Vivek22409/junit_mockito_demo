package com.nagarro.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import com.nagarro.mockito.CalculatorService;
import com.nagarro.mockito.MathApplication;

//@RunWith attaches a runner with the test class to initialize the test data

public class MathApplicationTester {
	@Mock
	private CalculatorService cs;

	@InjectMocks
	private MathApplication ma;

	@Before
	public void init() {
	    //MockitoAnnotations.initMocks(this);
		cs = mock(CalculatorService.class);
	}
	@Test
	public void testAddV1() {
		when(cs.add(10.10, 10.20)).thenReturn(20.30);
		assertEquals("The sum is incorrect! ",cs.add(10.10, 10.20), 20.30,0);
	}
	@Test
	public void testAddV2() {
		when(cs.add(1.0, 1.0)).thenReturn(2.0);
		assertEquals("Sum incorrect !",2.0, cs.add(1.0, 1.0),0);
		verify(cs,times(1)).add(eq(1.0),eq(1.0));
	}

}
