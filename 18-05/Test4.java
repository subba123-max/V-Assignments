package com.java.Demo;

public class Test4 {
	public static void main(String[] args) {
		MediaPlayer m= new CD();
				m.play();
		Combo m1= new DVD();
				m1.play();
		Newplayer n = new Newplayer();
				n.play();
		
	}

}
interface MediaPlayer{
	 abstract void play();
}
class CD implements MediaPlayer{
	public void play() {
		System.out.println("CD is playing");
	}
}
class DVD implements MediaPlayer,Combo{
	public void play() {
		System.out.println("Dvd is playing");
	}
}

interface Combo extends MediaPlayer{
	public default void play() {
		System.out.println("it will lay both CD and DVD");
	}
	
}
class Newplayer implements Combo{
	
}