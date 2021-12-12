package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.rules.ExpectedException;

import main.Calculator;


class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		assertEquals(calculator.add(Integer.MAX_VALUE, Integer.MIN_VALUE),Integer.MAX_VALUE+Integer.MIN_VALUE,"Error in Addition");
		assertEquals(calculator.add(0, Integer.MAX_VALUE),0+Integer.MAX_VALUE,"Error in Addition");

		assertEquals(calculator.add(Integer.MAX_VALUE, Integer.MAX_VALUE),Integer.MAX_VALUE+Integer.MAX_VALUE,"Error in Addition");

	}

	@ParameterizedTest
	@CsvFileSource(resources = "/data/convertcsv.csv",numLinesToSkip = 1)
	
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		assertEquals(calculator.add(valueOne, valueTwo),valueTwo + valueOne,"Error in Addition");
	}
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		assertEquals(calculator.sub(Integer.MAX_VALUE, Integer.MIN_VALUE),(double)(Integer.MAX_VALUE-Integer.MIN_VALUE),"Error in Subtraction");
		assertEquals(calculator.sub(0, Integer.MIN_VALUE),0-Integer.MIN_VALUE,"Error in Subtraction");
		assertEquals(calculator.sub(Integer.MAX_VALUE, 0),Integer.MAX_VALUE-0,"Error in Subtraction");

	}
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		assertEquals(calculator.multiply(0, 100),0*100,"Error in Multiplication");
		assertEquals(calculator.multiply(2, 100),(float)2*100,"Error in Multiplication");
		assertEquals(calculator.multiply(Integer.MAX_VALUE, Integer.MAX_VALUE),Integer.MAX_VALUE*Integer.MAX_VALUE,"Error in Multiplication");

	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		
		assertEquals(calculator.divide(100,4),100/4,"Error in Division");
		assertEquals(calculator.divide(2, 100),(float)2/100,"Error in Division");
		assertEquals(calculator.divide(Integer.MAX_VALUE, Integer.MIN_VALUE),Integer.MIN_VALUE/Integer.MAX_VALUE,"Error in Division");
		// Implement
	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		ArithmeticException thrown = Assertions.assertThrows(ArithmeticException.class, () -> {
			calculator.divide(100, 0);
	  },"Arithmetic Exception expected");
		
		
		

	}
}
