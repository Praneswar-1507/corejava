package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner array=new Scanner(System.in);
		list.add("name:sachin");
		list.add("location:Dindigul");
		list.add("age:18");
		System.out.println(list);
		list.add(0,"id:1234");
		System.out.println("After replacing:");
		System.out.println(list);
		list.remove(2);
		System.out.println("After removing:");
		System.out.println(list);
		boolean check=list.contains("name:");
		System.out.println("After checking data:");
		System.out.println(check);
		list.clone();
		System.out.println(list);
		

	}


	}


