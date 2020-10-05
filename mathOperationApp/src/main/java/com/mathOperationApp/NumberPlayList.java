/**
 * 
 */
package com.mathOperationApp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
		Function<Integer,Double> doubleFunction = Integer::doubleValue; //n->n.doubleValue();
		myNumberList.forEach(n->{
			System.out.println("forEach explicit lambda function the double value corresponding to integer is:: "+doubleFunction.apply(n));
		});
		
		/*
		 * Implicit lambda function to check even value in the list
		 * predicate function is used here
		 */
		Predicate<Integer> isEven = n->n%2==0;
		myNumberList.forEach(n->{
			System.out.println("forEach explicit lambda function checking if "+n+" is even : "+isEven.test(n));
		});
		
		myNumberList.stream().forEach(n->{
			System.out.println("UC2.1 - creating and iterating a stream : "+n);
		});
		
		List<Double> streamList = myNumberList.stream().filter(isEven).map(doubleFunction).collect(Collectors.toList());
		System.out.println("UC2.2 and UC2.3 and UC2.4 - tranform each element to double and store result "+streamList);
		
		//findFirst is a terminal operation
		Integer first = myNumberList.stream().filter(isEven).peek(n-> System.out.println("Peak Even Number :"+n)).findFirst().orElse(null);
		System.out.println("UC2.5 first even :"+first);
		
		Integer min = myNumberList.stream().filter(isEven).min((n1,n2)->n1-n2).orElse(null);
		System.out.println("UC2.6 minimum even number from list : "+min);
		
		Integer max= myNumberList.stream().filter(isEven).max(Comparator.comparing(Integer::intValue))
				/*.max((n1,n2)->{
			if(n1>n2)
				return n1;
			else return n2;
		})
		*/.orElse(null);
		System.out.println("UC2.6 maximum even number from list : "+max);
		
		Integer sum = myNumberList.stream().reduce(0,Integer::sum);
		long count = myNumberList.stream().count();
		// you'll have to cast if not using long
		System.out.println("UC2.7 sum of elements in stream is : "+sum+" and average is : "+(double)sum/count);
	
		boolean allEven = myNumberList.stream().allMatch(isEven);
		boolean anyEven = myNumberList.stream().anyMatch(isEven);
		boolean noneMultipleOfSix = myNumberList.stream().noneMatch(i->i>0&&i%6==0);
		System.out.println("UC2.8 all Even : "+allEven+" anyEven : "+anyEven+" multiple of six : "+noneMultipleOfSix);
		
		List<Integer> sortedList = myNumberList.stream().sorted((n1,n2)->n1.compareTo(n2)).collect(Collectors.toList());
		System.out.println("UC2.9 sorted list is : "+sortedList);
	}
}
