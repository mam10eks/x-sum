package com.empty_stack.x_sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.experimental.UtilityClass;

@UtilityClass
public class App
{
	public static void main(String[] args)
	{
		sampleSetsFrom0To(15).forEach(exampleSet ->
		{
			xSums().forEach(xSum ->
			{
				int expected = xSum.xsum(exampleSet);
				int actual = 0;//KSum.kSum(exampleSet.stream().mapToInt(i -> i).toArray(), xSum.getTargetNumberOfElements(), xSum.getTargetSum());
				
				if(expected != actual)
				{
					System.out.println(exampleSet + 
							"; numbers = "+ xSum.getTargetNumberOfElements() +
							"; sum = "+ xSum.getTargetSum() + " expected " +
							expected +
							" but found " + actual
					);
				}
			});
		});
	}
	
	private static Stream<Set<Integer>> sampleSetsFrom0To(int n)
	{
		return IntStream.range(0, n)
			.mapToObj(SetUtil::createSetWithNumbersFromOneToN);
	}
	
	private static Stream<XSum> xSums()
	{
		List<XSum> ret = new ArrayList<>();
		
		for(int i=0; i<100; i++)
		{
			for(int j=0; j<100; j++)
			{
				ret.add(new XSum(i, j));
			}
		}
		
		return ret.stream();
	}
}
