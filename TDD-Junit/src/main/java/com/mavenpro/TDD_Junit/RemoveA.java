package com.mavenpro.TDD_Junit;

public class RemoveA
{
	public static String del(String s)
	{
		String te=s.substring(0,2);
		return te.replaceAll("A","")+s.substring(2);
	}

}