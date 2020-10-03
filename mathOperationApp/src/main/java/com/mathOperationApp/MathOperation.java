/**
 * 
 */
package com.mathOperationApp;

/**
 * @author prashant
 *
 */
public class MathOperation {
	
	public static void main(String args[]) {
	IMathFunction add = Integer::sum;
	IMathFunction multiply = (x,y)->x*y;
	IMathFunction divide = (x,y)->{
		if(y==0)
			return 0;
		else return x/y;
	};
	System.out.println("Addition of 9 and 3 yeilds : "+add.calculate(9,3));
	System.out.println("Multiplication of 10 and 2 yeilds : "+multiply.calculate(10,2));
	System.out.println("Division of 4 and 0 yeilds : "+divide.calculate(4,0));
	
	IMathFunction.printResult(10, 5, "multiply", multiply);
	}
}	
