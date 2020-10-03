/**
 * 
 */
package com.mathOperationApp;

/**
 * @author prashant
 *
 */
@FunctionalInterface
public interface IMathFunction {
	int calculate(int a,int b);
	static void printResult(int a, int b, String function, IMathFunction obj) {
		System.out.println("Result of "+function+" of "+a+" and "+b+" is "+obj.calculate(a,b));
	}
}
