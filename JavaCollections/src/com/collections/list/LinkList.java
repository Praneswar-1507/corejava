package com.collections.list;
import java.util.*;
public class LinkList {

	public static void main(String[] args) {
		Scanner list=new Scanner(System.in);
		LinkedList linkedList=new LinkedList();
		linkedList.add(3);
		linkedList.add(10);
		System.out.println(linkedList);
		linkedList.addFirst(1);
		System.out.println("After adding in first index:");
		System.out.println(linkedList);
		linkedList.addLast(2);
		System.out.println("After adding in last index:");
		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		System.out.println(linkedList);
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList);
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		
	

	}

}
