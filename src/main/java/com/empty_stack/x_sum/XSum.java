package com.empty_stack.x_sum;

import java.util.HashSet;
import java.util.Set;

import lombok.Data;

@Data
public class XSum
{
	private final int targetNumberOfElements;
	
	private final int targetSum;

	public int xsum(HashSet<Integer> set)
	{
		int ret = 0;
		
		for(Set<Integer> subset: SetUtil.createPowerSet(set))
		{
			ret += isSolution(subset) ? 1 : 0;
		}
		
		return ret;
	}

	private boolean isSolution(Set<Integer> set)
	{
		return set != null && set.size() == targetNumberOfElements
				&& set.stream().mapToInt(i -> i).sum() == targetSum;
	}
}
