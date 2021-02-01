package com.epam.calculator;

import java.math.BigDecimal;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char expression;
        System.out.print("Enter First Number : ");
        BigDecimal first = sc.nextBigDecimal();
        System.out.print("Enter Second Number : ");
        BigDecimal second = sc.nextBigDecimal();
        System.out.print("Enter the Operation you want to perform : ");
        expression = sc.next().charAt(0);
        Calculator calculator = new Calculator();
        BigDecimal result = calculator.performOperations(first,second,expression);
        System.out.println("Result : " + result);
        sc.close();
    }
}
