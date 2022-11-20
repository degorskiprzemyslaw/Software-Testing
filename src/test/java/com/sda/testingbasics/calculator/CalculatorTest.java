package com.sda.testingbasics.calculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class CalculatorTest {

	private Calculator calculator = new Calculator();

	@BeforeAll
	static void beforeAll(){
		System.out.println("Before all");
	}

	@AfterAll
	static void afterAll(){
		System.out.println("After all");
	}


	@BeforeEach
	void beforeEach(){
		System.out.println("Before each");
		calculator = new Calculator();
	}

	@AfterEach
	void afterEach(){
		System.out.println("After each");
	}

	@Test
	void shouldAddTwoPositiveNumbers() {
		System.out.println("should add two positive numbers");
		//given
		double a = 1.0;
		double b = 2.0;
		//when

		double sum = calculator.add(a, b);

		//then

		//to chcemy uzyskać
		/*if(sum == 3 ) -> ok
		else -> fail*/
		assertEquals(3.0, sum, "1 + 2 should equals 3");
		//to samo tyle ze assertj
		assertThat(sum)
				.as("1 + 2 should equals 3")
				.isEqualTo(3.0);

	}

	@Test

	void shouldAddTwoNegativeNumbers() {
		System.out.println("should add two negative numbers");
		//given
		double a = -7.6;
		double b = -2;
		//when

		double sum = calculator.add(a,b);
		//then
		assertEquals(-9.6, sum, "-7.6 + -2 should equals -9.6");
	}


}