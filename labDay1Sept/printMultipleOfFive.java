/*
 * write a java program to print all the first 20 divisibles of 5 without using looping structures
 * @ Divya
 */
package com.labDay1Sept;
//importing required package 
import java.util.Scanner;
import java.util.stream.Stream;

public class printMultipleOfFive {
	//creating main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating scanner object to take users input
		Scanner obj = new Scanner(System.in);
		
		//asking user the limit to print the divisible of 5
		System.out.println("\t\t\t----------Divisible of  5------------- \nEnter the number till which you want to print the multiple of 5");
		int num = obj.nextInt();
		System.out.println("\t\t\t**First "+num+" numbers that are Divisible by 5 ** ");
		
	
		//using method reference and stream api
		Stream.iterate(1,i->i+1).filter(i->i%5==0).limit(num).forEach(System.out::println);
		
		//closing scanner object
		obj.close();
	}

}
