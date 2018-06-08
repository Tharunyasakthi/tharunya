package com.basic;

public abstract class Test implements Travel{
public static void main(String args[]) {
	Travel travelone=new Bike();
	Travel traveltwo=new Zebra();
	
	System.out.println(traveltwo instanceof Rat);
}
}