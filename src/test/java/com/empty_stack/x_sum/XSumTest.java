package com.empty_stack.x_sum;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Assert;
import org.junit.Test;

public class XSumTest
{
	@Test
	public void checkThatEmptyInputReturns0()
	{
		int expected = 0;
		int actual = new XSum(10, 10).xsum(new HashSet<>());
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatInputWithoutMatchingSumReturns0()
	{
		int expected = 0;
		int actual = new XSum(10, 10).xsum(new HashSet<>(Arrays.asList(2,3)));
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatInputWithSingleMatchingSubSetReturns1()
	{
		int expected = 1;
		int actual = new XSum(1, 4).xsum(new HashSet<>(Arrays.asList(2,3,4)));
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatInputWithTwoMatchingSubSetsReturns2()
	{
		int expected = 2;
		int actual = new XSum(2, 7).xsum(new HashSet<>(Arrays.asList(3,4,5,2)));
		
		Assert.assertEquals(expected, actual);
	}
}
