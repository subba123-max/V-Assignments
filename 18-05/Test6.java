package com.java.Demo;

public class Test6 {
public static void main(String[] as) {
	Simple1 s=new Simple1();
	s.show();
	Simple2 s1=new Simple2();
	s1.show();
	Simple2 s2=new Simple2();
	s2.show();
	Simple3 s3=new Simple3();
			s3.show();
	
	
}
}

class Simple{
	int a;
	int b;
	public void show() {
		System.out.println("this is simple ");
	}
}
class Simple1 extends Simple{
	
}
class Simple2 extends Simple1{
	public void show() {
		System.out.println("hello this is simple2 -");
	}
}

class Simple3 extends Simple{
	public void show() {
		System.out.println("hello this is Simple3-");
	}
}