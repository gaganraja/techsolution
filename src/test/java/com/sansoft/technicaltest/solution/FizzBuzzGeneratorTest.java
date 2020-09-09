package com.sansoft.technicaltest.solution;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sansoft.technicaltest.solution.constant.FizzBuzzConstants;

import org.junit.jupiter.api.Test;

@RunWith(JUnitPlatform.class)
public class FizzBuzzGeneratorTest {
	
	@Test
	public void testIncorrectParameters_ThrowException() {
		
		FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
		
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			fizzBuzzGenerator.generateFizzBuzz(0, -1);
		    });
		
		assertEquals(FizzBuzzConstants.ERROR_MESSAGE_INVALID_RANGE, exception.getMessage());
		
	}
	
	@Test
	public void testRangeStartGreaterThanRangeEnd_ThrowException() {
		
		FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
		
		Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
			fizzBuzzGenerator.generateFizzBuzz(2, 1);
		    });
		
		assertEquals(FizzBuzzConstants.ERROR_MESSAGE_INVALID_RANGE, exception.getMessage());
		
	}
	
	@Test
	public void testCorrectRangePrintsAsExpected() {
		
		FizzBuzzGenerator fizzBuzzGenerator = new FizzBuzzGenerator();
		List<Object> fizzBuzzList = fizzBuzzGenerator.generateFizzBuzz(1, 100);
		assertEquals(100, fizzBuzzList.size());
		assertEquals(1, fizzBuzzList.get(0));
		assertEquals(FizzBuzzConstants.FIZZ, fizzBuzzList.get(2));
		assertEquals(FizzBuzzConstants.BUZZ, fizzBuzzList.get(4));
		assertEquals(FizzBuzzConstants.FIZZ_BUZZ, fizzBuzzList.get(14));
	}
}

