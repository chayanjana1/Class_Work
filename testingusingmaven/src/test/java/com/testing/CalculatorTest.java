package com.testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
@DisplayName("Testing calculator class")
class CalculatorTest {
	Calculator cal;
	
	@BeforeAll
	 static void beforeAllInit()
	{
		System.out.println("this will excute before all test cases");
	}
	
	@AfterAll
	static void afterAllInit()
	{
		System.out.println("this will excute after all test cases");
	}
	
	@BeforeEach
	void init() {
		cal=new Calculator();
	}
	@AfterEach
	void cleanUp()
	{
		cal=null;
		System.out.println("cleanup...");
	}

@Test
@DisplayName("testing multiplication method")
	void testMultiplication() {
		Calculator cal=new Calculator();
		assertEquals(25, cal.multiplication(5,  5));
	}
@Test
@DisplayName("testing factorial method")
@DisabledOnOs(value = {OS.MAC})
@DisabledOnJre(value = {JRE.JAVA_17})
 @EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_16)   
void testFactorial()
	{
	System.setProperty("job", "dev");
	assumeFalse("dev".equals(System.getProperty("job")),CalculatorTest::message);//we are assuming condition has too be false
	   													//then test run else abort	
		//if above assumption is false then rest of test will run,else abort
		assertEquals(120, cal.factorial(5));
	}
@Nested
@DisplayName("nested class for all add method")
class TestAddition{
	
	@Test
	@DisplayName("testing addition method")
	@EnabledOnOs(value = {OS.WINDOWS,OS.LINUX})	
	   void testAddition() {
		boolean f=false;
		assumeTrue(f);//we are assuming f has to be true, then test run else abort
			//if above assumption is true rest of test will run,else abort
			assertEquals(10, cal.addition(5,  5),
					"this test method should add two int numbers");
		}

@Test
@DisplayName("testing exception")
@EnabledOnJre(value = {JRE.JAVA_8,JRE.JAVA_17})
public void testAdditionWithException()
{
	assertThrows(ArithmeticException.class,
			()->cal.additionWithException(10, 0));
}
@Test
@DisplayName("adding two negative number")
public void testaddTwoNegativeNo()
{
	assertEquals(-15, cal.addTwoNegativeNo(-5, -10));
}
@Test
@DisplayName("adding teo positive number")
public void testaddTwoPositiveNo()
{
	assertEquals(150, cal.addTwoNegativeNo(50, 100));
}
}//end of nasted class
@Test
void testMultiply()
{
	assertAll(
			()->assertEquals(4, cal.multiple(2,2)),
			()->assertEquals(0, cal.multiple(2,0)),
			()->assertEquals(-2, cal.multiple(2,-1))
			);
}
@Test
@DisplayName("this method should not run")
@Disabled
void testDisabled()
{
	fail("this test should be disabled");
}
private static String message()
{
	return "Test Execution is failed";
}

//@Test
//@RepeatedTest(3)
@RepeatedTest(value = 3)

public void testFindMax()
{
	System.out.println("repeted test");
	//int arr[]=new int[] {1,3,19,69,2};
	//assertEquals(69, cal.findMax(arr));
    assertEquals(-1, cal.findMax(new int[] {-1,-10,-3,-6}));
}
@Test
@DisplayName("To check null and true")
public void test()
{
	int num=6;
	String name="nil";
	
	//check false condition
	assertFalse(num>10);//asserting condition should be false
    //check true condition
	assertTrue(num<10); //expecting condition should be true
    
	//check for not null
	assertNotNull(name);//excepting name should not null
    
	//check for null
	assertNull(name); //excepting null
	
}
}

