/*
 * Write a java program to print sum of even numbers in arraylist using lambda expression
 * @ Divya
 */

package com.labDay1Sept;

//importing required package
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

 
public class calSumEven {
	public static void main(String args[]) {
		List<Integer>numbers=Arrays.asList(65,6,13,25,24,62,36,25,46,56);//list of numbers
		
		//using lamda expression 
		System.out.println("sum  of even numbers are-------------");
		System.out.println(numbers.stream().filter(i->i%2==0) //using intermediate operation to filter the list
				.reduce(0, Integer::sum));     //using reduce terminator operation
			

	}
	
	

}
