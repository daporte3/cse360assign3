/**
 * @author Douglas Porter
 * @version 2.0, 2/22/2016
 * @description Test cases for the Calculator.java class
 */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {

	@Test
	public void testCalculator() 
	{
		Calculator test1 = new Calculator();
		
		assertNotNull(test1);
	}
	
	@Test
	public void testGetTotal()
	{
		Calculator test2 = new Calculator();
		int testValue = test2.getTotal();
		
		assertEquals(0, testValue);
	}
	
	@Test
	public void testAdd()
	{
		Calculator test3 = new Calculator();
		test3.add(3);
		int testValue = test3.getTotal();
		
		assertEquals(3, testValue);
	}
	
	@Test
	public void testSubtract()
	{
		Calculator test4 = new Calculator();
		test4.subtract(3);
		int testValue = test4.getTotal();
		
		assertEquals(-3, testValue);
	}
	
	@Test
	public void testMultiply()
	{
		Calculator test5 = new Calculator();
		test5.add(3);
		test5.multiply(2);
		int testValue = test5.getTotal();
		
		assertEquals(6, testValue);
	}
	
	@Test
	public void testDivide()
	{
		Calculator test6 = new Calculator();
		test6.add(9);
		test6.divide(3);
		int testValue = test6.getTotal();
		
		assertEquals(3, testValue);
	}
	
	@Test
	public void testDivideByZero()
	{
		Calculator test6 = new Calculator();
		test6.add(9);
		test6.divide(0);
		int testValue = test6.getTotal();
		
		assertEquals(0, testValue);
	}
	
	@Test
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}
}
