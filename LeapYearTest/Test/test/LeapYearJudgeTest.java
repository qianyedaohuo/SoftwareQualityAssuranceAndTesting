package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeapYearJudgeTest extends LeapYearJudge {

	@Test
	public void test() {
		new LeapYearJudge();
		//测试输入年份与1582年的关系
		assertEquals("after1582",LeapYearJudge.isTrueInput(2000));
		assertEquals("after1582",LeapYearJudge.isTrueInput(1582));
		assertEquals("before1582",LeapYearJudge.isTrueInput(1581));
		assertEquals("before1582",LeapYearJudge.isTrueInput(-1));
		
		//测试输入的1582年以来的年分是否是闰年
		assertTrue(LeapYearJudge.isLeapYearA(10000));
		assertTrue(LeapYearJudge.isLeapYearA(2000));
		assertTrue(LeapYearJudge.isLeapYearA(1584));
		assertFalse(LeapYearJudge.isLeapYearA(1582));
		assertFalse(LeapYearJudge.isLeapYearA(2021));
		
		//测试输入的1582年之前的年分是否是闰年
		assertTrue(LeapYearJudge.isLeapYearB(1580));
		assertTrue(LeapYearJudge.isLeapYearB(-5));
		assertTrue(LeapYearJudge.isLeapYearB(0));
		assertFalse(LeapYearJudge.isLeapYearB(1581));
		assertFalse(LeapYearJudge.isLeapYearB(-3));
		assertFalse(LeapYearJudge.isLeapYearB(-4));
	}

}
