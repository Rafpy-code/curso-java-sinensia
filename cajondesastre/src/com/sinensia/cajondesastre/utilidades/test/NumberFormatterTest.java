package com.sinensia.cajondesastre.utilidades.test;

import com.sinensia.cajondesastre.utilidades.NumberFormatter;
import com.sinensia.cajondesastre.utilidades.impl.NumberFormatterJordiDeluxeImpl;
import com.sinensia.cajondesastre.utilidades.impl.NumberFormatterSuperImplUltraFast;

public class NumberFormatterTest {

	public static void main(String[] args) {
		
		NumberFormatter numberFormatter = null;
	
		// Vamos a utilizar una implementación al azar...
		
		if(Math.random() > 0.5) {
			numberFormatter = new NumberFormatterJordiDeluxeImpl();
		} else {
			numberFormatter = new NumberFormatterSuperImplUltraFast();
		}
		
		System.out.println(numberFormatter.convert(9));
		System.out.println(numberFormatter.convert(100));
		System.out.println(numberFormatter.convert(579));
		System.out.println(numberFormatter.convert(999));
		
	}

}
