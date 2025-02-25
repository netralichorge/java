package com.learn.Ecommerce;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EcommerceApplicationTests {
	
	@Autowired
	CustomerService customerService;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testAdd()
	{
		Calculator calculator=new Calculator();
		 int actualResult = calculator.add(10, 2);
		 int expectedResult = 12;
		 assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testSub()
	{
		Calculator calculator =  new Calculator();
		int actualResult = calculator.sub(20, 5);
		int expectedResult = 15;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void testMul()
	{
		Calculator calculator = new Calculator();
		int actualResult = calculator.mul(4,6);
		int expectedResult = 24;
		assertEquals(expectedResult,actualResult);
	}
	
	@Test
	public void testIsEven()
	{
		Calculator calculator = new Calculator();
		int n=90;
		assertEquals(true, calculator.isEven(n));
	}
	
	@Test
	public void testGetCustomer()
	{
		assertNotNull(customerService.getCustomer(101, "Netrali"));
	}

}
