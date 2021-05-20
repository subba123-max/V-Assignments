package com.v20_05.java;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("ram");
		l1.add("rahul");
		l1.add("virat");
		l1.add("raina");
		l1.add("dhoni");
		System.out.println("before using set():-"+l1);
		l1.set(0, "bheem");
		System.out.println("after using set():-"+l1);
		System.out.println("pop():-"+l1.pop());
		l1.push("boooom");
		System.out.println("after using push():-"+l1);
		System.out.println("peek():-"+l1.peek());
		System.out.println("peekFirst():-"+l1.peekFirst());
		System.out.println("peekLast():-"+l1.peekLast());
		System.out.println(l1.offer("anil"));
		System.out.println("after using offer():-"+l1);
		Iterator<String> itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println("using iterator():-"+itr.next());
		}
		System.out.println("pollfirst:-"+l1.pollFirst());
		System.out.println("polllast:-"+l1.pollLast());
		
		
	}

}
