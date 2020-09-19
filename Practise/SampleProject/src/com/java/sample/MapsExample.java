package com.java.sample;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	static Map<Integer, String> pair = new HashMap<>();

	public static void mapping() {
		pair.put(1, "Apple");
		pair.put(2, "Mango");
		pair.put(3, "Grapes");
		pair.put(4, "watermelon");
		printvalues();
		

	}
	
	public static void printvalues(){
		for(Map.Entry<Integer,String> keyvalue: pair.entrySet()){
			System.out.println("key : "+keyvalue.getKey()+"   "+"value :" +keyvalue.getValue());
		}
		for(Integer key : pair.keySet()){
					System.out.println(pair.get(key));
		}
		pair.remove(4);
		System.out.println(pair);
		
	}

	public static void main(String[] args) {
		mapping();

	}
}
