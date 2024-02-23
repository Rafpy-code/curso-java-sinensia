package com.sinensia.cajondesastre.interfaces.impl;

import com.sinensia.cajondesastre.interfaces.Calculator;

public class CalculatorImpl implements Calculator{

	@Override
	public double sumar(double operando1, double operando2) {
		
		return operando1 + operando2;
	}

	@Override
	public double multiplicar(double operando1, double operando2) {
		
		return operando1 * operando2;
	}

	@Override
	public double dividir(double operando1, double operando2) {
		
		return operando1 / operando2;
	}

	@Override
	public double arcoTangente(double operando1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double secante(double operando1) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double logaritmo(double operando1) {
		// TODO Auto-generated method stub
		return 0;
	}


}
