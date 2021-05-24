package com.v21_05.java;

public class Demo  implements B{
	void hello()
	{
		
	}
public static void main(String[] as) {
	
	
//Hello h= new Hello()
;
	

}
}
interface Hai{
	default void m1() {
		System.out.println("hai");
	}	
}
interface B{
	default void m1() {
		System.out.println("B");
	}	
}




class Hello implements Hai ,B{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	
}