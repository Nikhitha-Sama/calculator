package com.epam.calculator;

import java.math.BigDecimal;
public class Calculator { 

	public BigDecimal performOperations(BigDecimal a,BigDecimal b,int expression)
    {
        BigDecimal result;
        switch(expression)
        {
            case '+':
                result = Expression.addition(a,b);
            break;
            case '-':
                result = Expression.subraction(a,b);
            break;
            case '*':
                result = Expression.multiplication(a,b);
            break;
            case '/':
                result = Expression.division(a,b);
            break;
            default:
                throw new ArithmeticException();
        }
        return result;
    }
}
