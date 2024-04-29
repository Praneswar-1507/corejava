package com.collections.list;
import java.util.*;
public class CollectionsQueue {

	public static void main(String[] args) {
		Queue queue=new LinkedList();
		queue.add(5);
		queue.add(6);
		queue.add(7);
		System.out.println(queue);
		System.out.println(queue.contains(6));
		System.out.println(queue.size());
		

	}

}
