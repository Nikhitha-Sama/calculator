package com.epam.calculator;

import java.math.BigDecimal;
public class Expression { 
	
	 public static BigDecimal addition(BigDecimal a,BigDecimal b)
	    {
	        return a.add(b);
	    }

	    public static BigDecimal subraction(BigDecimal a,BigDecimal b)
	    {
	        return a.subtract(b);
	    }

	    public static BigDecimal multiplication(BigDecimal a,BigDecimal b)
	    {
	        return a.multiply(b);
	    }

	    public static BigDecimal division(BigDecimal a,BigDecimal b)
	    {
	        return  a.divide(b);
	    }

}
