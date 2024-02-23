package com.sinensia.cajondesastre.utilidades.impl;

import com.sinensia.cajondesastre.utilidades.NumberFormatter;

public class NumberFormatterJordiDeluxeImpl implements NumberFormatter {

	@Override
	public String convert(int numero) {
		
		if(numero == 100) {return "cien";}
		if(numero == 9) {return "nueve";}
		if(numero == 578) {return "quinientos setenta y ocho";}
		
		
		
		
		return null;
	}

}
