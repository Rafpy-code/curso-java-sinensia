package com.example.demo.services.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.example.demo.services.NumberFormatter;

class NumberFormatterImplTest {

private NumberFormatter numberFormatter = new NumberFormatterImpl();
	
	@Test
	void convertTest() {
				
		assertEquals("quince", numberFormatter.convert(15));
		assertEquals("un millón ochocientos cuarenta y cinco mil trescientos cuarenta y tres", numberFormatter.convert(1845343));
		assertEquals("novecientos noventa y nueve millones novecientos noventa y nueve mil novecientos noventa y nueve",numberFormatter.convert(999999999));
		assertEquals("cero", numberFormatter.convert(0));
		assertEquals("cuarenta", numberFormatter.convert(40));
		assertEquals("doscientos cuatro", numberFormatter.convert(204));
		assertEquals("veinticinco", numberFormatter.convert(25));
		assertEquals("un millón",numberFormatter.convert(1000000));
		assertEquals("dos millones",numberFormatter.convert(2000000));
		assertEquals("diez millones",numberFormatter.convert(10000000));
		assertEquals("veinte millones",numberFormatter.convert(20000000));
		assertEquals("diez millones cien mil uno",numberFormatter.convert(10100001));
		assertEquals("cien millones cien mil uno",numberFormatter.convert(100100001));
		assertEquals("mil millones mil",numberFormatter.convert(1000001000));
		assertEquals("dos mil cien millones mil",numberFormatter.convert(2100001000));
			
	}

}
