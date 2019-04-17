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
		
		for(int i=0; i< (set.size()<<1); i++)
		{
			Set<T> currentSet = new HashSet<>();
			
			for(int j=0; j<set.size(); j++)
			{
				if(nthBitIsSet(i, j))
				{
					currentSet.add(set.get(j));
				}
			}
			
			ret.add(currentSet);
		}

		return ret;
	}
	
	private static boolean nthBitIsSet(int i, int bit)
	{
		return ((i & (1 << bit)) != 0);
	}
}
