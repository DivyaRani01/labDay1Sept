/*
 * Assume you are electrnoic shop owner and you have all the electrnoics in a list and you need to sort the laptops whose price is less than 30000,electrnoics class 
have fields like eid,eName, eCompany,ePrice, eModel,create arraylist and apply stream api features to sort
 @ Divya
 */
package com.labDay1Sept;
//importing required package
import java.util.ArrayList;
import java.util.Scanner;

public class eShopStream {
//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		electronics e1= new electronics(071,"Smart phone" , "Realme" , "3 pro", 22000);
		electronics e2= new electronics(102, "laptop", "hp", "pavilion", 29000);
		electronics e3= new electronics(042, "Speaker", "AudioBooster", "volinfinity", 5000);
		electronics e4= new electronics(104, "laptop", "VIVO", "Asus i5", 10000);
		electronics e5= new electronics(105, "laptop", "Macbook", "Pro 13", 20000);
		electronics e6= new electronics(036, "Iphone", "Apple", "13 pro", 40000);
		electronics e7= new electronics(007, "Smart phone", "Oneplus", "XY", 6000);
		electronics e8= new electronics(101, "laptop", "Dell", "Voshtro 3510", 18000);
		
		//adding elements
		ArrayList<electronics> al = new ArrayList<electronics>();
		al.add(e8);
		al.add(e7);
		al.add(e5);
		al.add(e6);
		al.add(e2);
		al.add(e1);
		al.add(e3);
		al.add(e4);
		
		System.out.println("--------Laptops having prize less tha 30000------------");
		//using filter and for each operations to filter 
		al.stream().filter(pro->pro.ePrice<30000).filter(pro->pro.eName=="laptop").forEach(pro->{
			System.out.println(pro.eid+"  "+pro.eCompany+"  "+pro.eName+" is of Rs: "+pro.ePrice+"  having model "+pro.eModel);
			

		  });
		

	}

}
