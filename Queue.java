//How to create Priority Queue program in java?

import java.util.*;
public class Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
	p.add(15);
	p.add(50);
	p.add(30);
	p.add(20);
	System.out.println(p);
	
	System.out.println("head is:"+p.peek());
	
	System.out.println("poll removed value is:"+p.poll());
	System.out.println("after poll removal:"+p);
	}
}
