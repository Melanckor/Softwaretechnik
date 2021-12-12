package test;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.hamcrest.core.Is;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalendar {
   

   
	@ParameterizedTest
	@ValueSource( ints = {2396,2400,1804,2116,2232})
	public void Should_return_true(int year) {
		main.Calendar Cal = new main.Calendar(year);
        assertEquals(Cal.isLeapYear(),true);
		// Implement
	}

	@ParameterizedTest
	@ValueSource(ints = {2395,2401,1805,2117,2233})
	public void Should_return_false(int year) {
		main.Calendar Cal = new main.Calendar(year);
        assertEquals(Cal.isLeapYear(),false);
		// Implement
	}
    //flats or decimal numbers dont make sense as an input, 
	//We expect that the test has no fails.
	@ParameterizedTest
	@ValueSource(ints = {-2396,-2400,Integer.MAX_VALUE,-Integer.MIN_VALUE,-2233})
	public void Should_return_if_year_is_leap(int year) {
		main.Calendar Cal = new main.Calendar(year);
        assertEquals(Cal.isLeapYear(),false);
	}

	// 
}
