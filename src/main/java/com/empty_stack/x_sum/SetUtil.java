package com.empty_stack.x_sum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import lombok.experimental.UtilityClass;

@UtilityClass
public class SetUtil
{
	public static Set<Integer> createSetWithNumbersFromOneToN(int n)
	{
		return IntStream.range(1,n+1)
				.mapToObj(i -> i)
				.collect(Collectors.toSet());
	}

	public static <T> Set<Set<T>> createPowerSet(HashSet<T> set)
	{
		if(!set.isEmpty())
		{
			return (HashSet) new HashSet<Set<Integer>>(Arrays.asList(
					new HashSet<Integer>(Arrays.asList(1)),
					new HashSet<Integer>()));
		}
		
		return new HashSet<>();
	}
}
