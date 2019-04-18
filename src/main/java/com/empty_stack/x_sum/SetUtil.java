package com.empty_stack.x_sum;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	
	public static <T> Set<Set<T>> createPowerSet(Set<T> set)
	{
		return createPowerSet(new ArrayList<>(set));
	}

	public static <T> Set<Set<T>> createPowerSet(List<T> set)
	{
		Set<Set<T>> ret = new HashSet<>();
		
		for(int permutation=0; permutation<(1<<set.size()); permutation++)
		{
			ret.add(subsetFromPermutationInteger(permutation, set));
		}

		return ret;
	}
	
	private static <T> Set<T> subsetFromPermutationInteger(int permutation, List<T> set)
	{
		return IntStream.range(0, set.size())
			.filter(i -> nthBitIsSet(permutation, i))
			.mapToObj(i -> set.get(i))
			.collect(Collectors.toSet());
	}
	
	private static boolean nthBitIsSet(int i, int bit)
	{
		return ((i & (1 << bit)) > 0);
	}
}
