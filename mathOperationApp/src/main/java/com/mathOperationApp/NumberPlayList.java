/**
 * 
 */
package com.mathOperationApp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
		 * implicit lambda function
		 * used when action is to be performed multiple times
		 */
		myNumberList.forEach(n->{
			System.out.println("forEach explicit lambda function respective values are ::"+n);
		});
	}
}
