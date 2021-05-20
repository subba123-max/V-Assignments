package com.v19_05.java;

class RunnableDemo extends Thread {
	private Thread t;
	private String threadName;
	public RunnableDemo(String name){
		threadName = name;
		System.out.println("creating"+threadName);
	}
	public void run() {
		System.err.println("Running"+threadName);
		try {
			for(int i = 4;i>0;i--) {
				System.out.println("Thread:--"+threadName+" , "+i);
				Thread.sleep(1000);
			}
		} catch(InterruptedException e){
			System.out.println("Thread"+threadName+"interrupted");
		}
		System.out.println("Thread"+threadName+"Exiting");
	}
	public void start() {
		System.out.println("Starting"+threadName);
		if(t==null) {
			t = new Thread(this,threadName);
			t.start();
		}
	}
}
