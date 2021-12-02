package prjTriangle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {
	/*
	 * @Test void test() { fail("Not yet implemented"); }
	 */
	
	Triangle T1 = new Triangle(50, 50, 1);//等腰
	Triangle T2 = new Triangle(50, 50, 10);//等腰
	Triangle T3 = new Triangle(50, 50, 50);//等边
	Triangle T4 = new Triangle(50, 50, 99);//等腰
	Triangle T5 = new Triangle(50, 50, 100);//非三角形
	
	Triangle T6 = new Triangle(50, 1, 50);//等腰
	Triangle T7 = new Triangle(50, 10, 50);//等腰
	Triangle T8 = new Triangle(50, 99, 50);//等腰
	Triangle T9 = new Triangle(50, 100, 50);//非三角形

	Triangle T10 = new Triangle(1, 50, 50);//等腰
	Triangle T11 = new Triangle(10, 50, 50);//等腰
	Triangle T12 = new Triangle(99, 50, 50);//等腰
	Triangle T13 = new Triangle(100, 50, 50);//非三角形
	
	Triangle T14 = new Triangle(30, 40, 50);//不等边
	Triangle T15 = new Triangle(20, 48, 52);//不等边

	@Test
	public void testIsTriangle() {
		
		assertTrue(T1.isTriangle(T1));
		assertTrue(T2.isTriangle(T2));
		assertTrue(T3.isTriangle(T3));
		assertTrue(T4.isTriangle(T4));
		assertFalse(T5.isTriangle(T5));
		
		assertTrue(T6.isTriangle(T6));
		assertTrue(T7.isTriangle(T7));
		assertTrue(T8.isTriangle(T8));
		assertFalse(T9.isTriangle(T9));
		
		assertTrue(T10.isTriangle(T10));
		assertTrue(T11.isTriangle(T11));
		assertTrue(T12.isTriangle(T12));
		assertFalse(T13.isTriangle(T13));
	}

	@Test
	public void testGetType() {
		//等边
		assertEquals("Regular",T3.getType(T3));
		
		//不等边
		assertEquals("Scalene",T14.getType(T14));
		assertEquals("Scalene",T15.getType(T15));
		
		//等腰
		assertEquals("Isosceles",T1.getType(T1));
		assertEquals("Isosceles",T2.getType(T2));
	}
	
	@Test
	public void testDiffOfBorders() {
		
		assertEquals((T7.lborderA - T7.lborderB),T7.diffOfBorders(T7.lborderA,T7.lborderB));
		assertEquals((T8.lborderB - T8.lborderA),T8.diffOfBorders(T8.lborderA,T8.lborderB));
		
		assertEquals((T11.lborderB - T11.lborderA),T11.diffOfBorders(T11.lborderA,T11.lborderB));
		assertEquals((T12.lborderA - T12.lborderB),T12.diffOfBorders(T12.lborderA,T12.lborderB));
	}

}
