package com.empty_stack.x_sum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class SetUtilTest
{
	@Test
	public void checkThatEmptySetIsCreatedForZero()
	{
		Set<Integer> expected = new HashSet<>();
		Set<Integer> actual = SetUtil.createSetWithNumbersFromOneToN(0);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatSetWithOneAndTwoSetIsCreatedForTwo()
	{
		Set<Integer> expected = new HashSet<>(Arrays.asList(1,2));
		Set<Integer> actual = SetUtil.createSetWithNumbersFromOneToN(2);
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatThePowerSetOfTheEmptySetIsEmpty()
	{
		Set<Set<Integer>> expected = new HashSet<>();
		Set<Set<Integer>> actual = SetUtil.createPowerSet(new HashSet<>());
		
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void checkThatAllElementsOfThePowerSetOfOneAreRetrieved()
	{
		Set<Set<Integer>> expected = new HashSet<>(Arrays.asList(
			new HashSet<>(Arrays.asList(1)),
			new HashSet<>()
		));
			
		Set<Set<Integer>> actual = SetUtil.createPowerSet(new HashSet<>(Arrays.asList(1)));
			
		Assert.assertEquals(expected, actual);
	}
	
	/*
	@Test
	public void checkThatAllElementsOfThePowerSetOfOneAndTwoAreRetrieved()
	{
		Set<Set<Integer>> expected = new HashSet<>(Arrays.asList(
			new HashSet<>(Arrays.asList(1,2)),
			new HashSet<>(Arrays.asList(1)),
			new HashSet<>(Arrays.asList(2)),
			new HashSet<>()
		));
		
		Set<Set<Integer>> actual = SetUtil.createPowerSet(new HashSet<>(Arrays.asList(1,2)));
		
		Assert.assertEquals(expected, actual);
	}*/
}
