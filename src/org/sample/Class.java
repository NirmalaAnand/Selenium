package org.sample;

import java.util.Set;
import java.util.TreeSet;

//Create a TreeSet for the below values
//Input : List = 10,20,30,40,50,60,70,80,90,10,20
public class Class {
	public static void main(String[] args) {
		Set<Integer> s=new TreeSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		
		System.out.println(s);
		
	}

}
