package org.codejudge.sb.entity;



import org.springframework.stereotype.Component;

@Component
public class NumberService {

	
	public long calculateSum(long a, long b)
	{
		return a+b;
	}
}
