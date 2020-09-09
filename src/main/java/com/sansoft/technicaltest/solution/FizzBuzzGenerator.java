package com.sansoft.technicaltest.solution;

import static java.util.stream.Collectors.toList;

import java.util.List;
import java.util.stream.IntStream;

import com.sansoft.technicaltest.solution.constant.FizzBuzzConstants;



public class FizzBuzzGenerator {
	
	public List<Object> generateFizzBuzz(int start, int end) {
		if(start <= 0 || end <= 0 || end < start) {
			throw new IllegalArgumentException(FizzBuzzConstants.ERROR_MESSAGE_INVALID_RANGE);
		}
		List<Object> fizzBuzzList = IntStream.rangeClosed(start, end)
		.mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? FizzBuzzConstants.FIZZ_BUZZ : FizzBuzzConstants.FIZZ) : (i % 5 == 0 ? FizzBuzzConstants.BUZZ : i))
		.collect(toList());
		fizzBuzzList.forEach(System.out::println);
		return fizzBuzzList;
	}

}
