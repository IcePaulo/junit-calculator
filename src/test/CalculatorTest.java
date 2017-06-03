package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.Calculator;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
	public void testDodawania1() throws Exception {
		double a = 1.2;
		double b = 1.6;
		
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 2.8, wynik, 0.001);
		
	}
	
	@Test
	public void testDodawania2() throws Exception {
		double a = 3;
		double b = 1.6;
		
		double wynik = classUnderTest.sum(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 4.6, wynik, 0.001);
		
	}
	
	@Test
	public void testOdejmowania1() throws Exception {
		double a = 2.8;
		double b = 1.2;
		
		double wynik = classUnderTest.subtract(a, b);
		
		Assert.assertEquals("bledny wynik odejmowania", 1.6, wynik, 0.001);
		
	}
	
	@Test
	public void testOdejmowania2() throws Exception {
		double a = 1.2;
		double b = 1.6;
		
		double wynik = classUnderTest.subtract(a, b);
		
		Assert.assertEquals("bledny wynik odejmowania", -0.4, wynik, 0.001);
		
	}
	
	@Test
	public void testMnozenia1() throws Exception {
		double a = 1.2;
		double b = 1.6;
		
		double wynik = classUnderTest.multiply(a, b);
		
		Assert.assertEquals("bledny wynik mnozenia", 1.92, wynik, 0.001);
		
	}
	
	@Test
	public void testMnozenia2() throws Exception {
		double a = -3;
		double b = 0;
		
		double wynik = classUnderTest.multiply(a, b);
		
		Assert.assertEquals("bledny wynik mnozenia", 0, wynik, 0.001);
		
	}
	
	@Test
	public void testDzielenia1() throws Exception {
		double a = 6;
		double b = 2;
		
		double wynik = classUnderTest.divide(a, b);
		
		Assert.assertEquals("bledny wynik dzielenia", 3, wynik, 0.001);
		
	}
	
	@Test
	public void testDzielenia2() throws Exception {
		double a = 1.2;
		double b = 0.6;
		
		double wynik = classUnderTest.divide(a, b);
		
		Assert.assertEquals("bledny wynik dodawania", 2, wynik, 0.001);
		
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDzieleniaPrzezZero() throws Exception {
		double a = 1.2;
		double b = 0;
		
		double wynik = classUnderTest.divide(a, b);
		
		Assert.assertEquals("tes dzielenia przez 0", 2, wynik, 0.001);
		
	}

}
