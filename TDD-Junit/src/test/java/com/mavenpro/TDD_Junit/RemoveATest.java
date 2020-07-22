package com.mavenpro.TDD_Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RemoveATest {
	@Test
	void test1()
	{assertEquals("BCD",RemoveA.del("ABCD"));}
	@Test
	void test2()
	{assertEquals("CD",RemoveA.del("AACD"));}
	@Test
	void test3()
		{assertEquals("BBCD",RemoveA.del("BBCD"));}
	@Test
	void test4()
		{assertEquals("BBAA",RemoveA.del("AABBAA"));}
}