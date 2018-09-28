package com.nagarro.mockito;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.MockitoAnnotations.*;




@RunWith(JUnit4.class)
public class MockitoDemo {

	//private Calculator mockCal;
	@Mock
	Figure figure;

	@Before()
	public void create() {
		//mockCal = mock(Calculator.class);
		MockitoAnnotations.initMocks(this);
		when(figure.getArea(4, 5)).thenReturn(20);
	}	

	

	@Test
	public void testAdd() {

		assertSame("Invalid sum",20, figure.getArea(4, 5));
	}

}
