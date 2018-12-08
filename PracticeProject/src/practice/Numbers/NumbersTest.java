package practice.Numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practice.Numbers.Numbers;

class NumbersTest {
	/*
	 *  Nth Digit of Pi Test cases 
	 */
	@Test
	void PiTo3Digits() {
		assertEquals(Numbers.getNthDigitOfPi(2), 3.14);
	}
	
	@Test
	void PiTo0Digits() {
		assertEquals(Numbers.getNthDigitOfPi(0), 3.0);
	}
	
	@Test
	void PiTo100Digits() {
		double Pi100Digits = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
		assertEquals(Numbers.getNthDigitOfPi(100), Pi100Digits);
	}

	/*
	 *  Nth Digit of E Test cases 
	 */
	@Test
	void ETo3Digits() {
		assertEquals(Numbers.getNthDigitOfE(2), 2.71);
	}
	
	@Test
	void ETo0Digits() {
		assertEquals(Numbers.getNthDigitOfE(0), 2.0);
	}
	
	@Test
	void ETo100Digits() {
		double E100Digits = 2.7182818284590452353602874713526624977572470936999595749669676277240766303547594571382178525166427427;
		assertEquals(Numbers.getNthDigitOfE(100), E100Digits);
	}
	
}
