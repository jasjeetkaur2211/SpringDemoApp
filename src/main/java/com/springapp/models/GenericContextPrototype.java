package com.springapp.models;
/*
	Use this class for testing of context. this class returns simple string, int values that can be used
	for verifying contexts.
	
*/
import java.util.Random;

public class GenericContextPrototype {
	String demoValue;
	public int getValue(){
		return new Random().nextInt();
	}
	
	public int getComparator(){
		return new Random().nextInt();
	}

}// end class GenericContextPrototype
