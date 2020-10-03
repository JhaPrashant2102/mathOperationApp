/**
 * 
 */
package com.mathOperationApp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @author prashant
 *
 */
public class NumberPlayList {
	public static void main(String args[]) {
		List<Integer> myNumberList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myNumberList.add(i);
		}
		
		/*
		 * Explicit lambda function
		 * used when action is to be performed only once
		 */
		
		Consumer<Integer> myListAction = n->{
			System.out.println("forEach explicit lambda function respective values are ::"+n);
		};
		myNumberList.forEach(myListAction);
		
		/*
		 * Implicit lambda function
		 * used when action is to be performed multiple times
		 */
		myNumberList.forEach(n->{
			System.out.println("forEach explicit lambda function respective values are ::"+n);
		});
		
		/*
		 * Implicit lambda function to to convert integer to double value
		 * and then to print those double values
		 */
		Function<Integer,Double> doubleFunction = Integer::doubleValue;
		myNumberList.forEach(n->{
			System.out.println("forEach explicit lambda function the double value corresponding to integer is:: "+doubleFunction.apply(n));
		});
		
		
	}
}
