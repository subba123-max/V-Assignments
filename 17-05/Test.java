package com.java.Demo;

public class Test {
public static void main(String as[]) {

Main m= new Main(10,"ram",12.1f);
System.out.println(m.a);
System.out.println(m.b);
System.out.println(m.c);



}
}
class Main{
	int a;
	String b;
	float c;
	
	public Main(int a, String b, float c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	
	
}