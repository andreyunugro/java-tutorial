package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcateTest {

	@Test
	public void testConcatenante() {
		WeekOne test = new WeekOne();
		String result = test.concatenante("one", "two");
		assertEquals("onetwo", result);
	}

}
