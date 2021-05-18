package com.java.Demo;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Demo d1=new Demo(10,"ronald",10.0);
		System.out.println(d1.a+" "+d1.s+" "+d1.d);

	}

}
class Demo{
	int a=1;
	String s="ram";
	double d=100.0;
	public Demo(int a,String s,double d) {
		super();
		this.a=a;
		this.s=s;
		this.d=d;
	}
	public Demo() {
		super();
		
	}

}