package com.java.Demo;

public class Test5 {

	public static void main(String[] args) {
	Dummy d = new Dummy(10, "ram", 10);
	d.show();
System.out.println(d.a);
//System.out.println(d.s);
SubDummy sd=new SubDummy(12, "rahim", 56, 99);
System.out.println(sd.a);
//System.out.println(sd.s);

	}

}
class Dummy{
	public int a;
	private String s;
	protected int b;
	public void show() {
		System.out.println("this method is from Dummy class");
	}
	public Dummy(int a, String s, int b) {
		super();
		this.a = a;
		this.s = s;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
}
class SubDummy extends Dummy{
	public int d;

	public SubDummy(int a, String s, int b,int d) {
		super(a, s, b);
			this.d=d;
	}
	
}