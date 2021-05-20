package com.v19_05.java;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println("connection started");
//			int a=12/0;
			int[] b= {1,2,3};
			System.out.println("b"+b[3]);
//			System.out.println(a);
		}catch (ArithmeticException e) {
			System.err.println(e);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.err.println(a);
		}
		finally {
			System.out.println("connection Ended");
			
		}

	}

}
