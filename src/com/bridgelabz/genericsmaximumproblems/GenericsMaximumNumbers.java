package com.bridgelabz.genericsmaximumproblems;

public class GenericsMaximumNumbers {
	
	public static <A extends Comparable<A>> A maximum (A x, A y, A z){

		 A max = x;

		 if (y.compareTo(max) > 0) {
			 max = y;

		 }
		 if (z.compareTo(max)>0) {
			 max = z;
		 }

		 return max;

	 }
	 public static void main1(String[] args) {
		System.out.println (maximum(5, 6, 1));
		System.out.println ( "Maximum Float Value is : " +maximum(5.4, 6.9, 1.42));

	 }
}

public static <A extends Comparable<A>> A maximum(A x, A y, A z) {
    A max = x;
    if (y.compareTo(max) > 0) {
        max = y;
    }
    if (z.compareTo(max) > 0) {
        max = z;
    }
    return max;
}

public static void main(String[] args) {
    System.out.println("Maximum String Value is : " + maximum("A", "K", "X"));
}
}




