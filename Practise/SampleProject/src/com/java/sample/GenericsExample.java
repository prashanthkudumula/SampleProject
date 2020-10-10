package com.java.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Generics
//1.They introdued form java 1.5
//2.provide type Safety at compile time
//3Any 
//4.Some real time Objects

//T,E,V,K ,Map<K,V>

//DATA ADDED
// Data added by Prashanth
class CommonUtility {
	public <T> long getCountObjects(List<T> list) {
		return list.stream().count();
	}
}

class MaximumInteger {
	public int maximun(int x, int y, int z) {
		
		int n=0;

		int max = x;

		if (y > max)
			max = y;
		if (z > max)
			max = z;

		return max;
	}
}

class MaximumDouble {
	public double maximun(double x, double y, double z) {

		double max = x;

		if (y > max)
			max = y;
		if (z > max)
			max = z;

		return max;
	}
}

class MaximunGeneric {

	public <T extends Comparable<T>> T maximum(T x, T y, T z) {

		T max = x;

		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;

		return max;

	}
}

public class GenericsExample {

	public static void main(String[] args) {

		// 2.provide type Safety

		List<Integer> list = new ArrayList<>();
		list.add(10);
		// list.add("Hello");
		// list.add(10.5);

		for (int i = 0; i < list.size(); i++) {
			int val = list.get(i);
			System.out.println(val);
		}

		// 3.Code reuability

		System.out.println("Maximum Number " + new MaximumInteger().maximun(4, 9, 6));
		System.out.println("Maximum Number " + new MaximumDouble().maximun(4.5, 9.1, 6.8));

		System.out.println("\n Using Generics");

		System.out.println("Maximum Number " + new MaximunGeneric().maximum(4, 9, 6));
		System.out.println("Maximum Number " + new MaximunGeneric().maximum(4.5, 9.1, 6.8));

	
	}
}
